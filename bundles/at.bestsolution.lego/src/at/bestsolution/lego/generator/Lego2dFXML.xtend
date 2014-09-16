/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GPL v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.lego.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import at.bestsolution.lego.lego.Model
import at.bestsolution.lego.lego.Brick
import at.bestsolution.lego.lego.LegoElement
import com.google.inject.Inject
import at.bestsolution.lego.lego.Item
import at.bestsolution.lego.lego.Door
import at.bestsolution.lego.lego.Assembly
import at.bestsolution.lego.lego.FxmlInclude
import java.io.FileReader

class Lego2dFXML implements IGenerator {
	@Inject
	@Extension
	Util util
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val m = input.contents.head as Model
		if( m.assembly != null ) {
			fsa.generateFile("2d/" + m.assembly.name+".fxml",m.assembly.generateFXML)
		} else {
			m.repo.elementList.forEach[
				fsa.generateFile("2d/" + it.name+".fxml",it.generateFXML)
			]
		}		
	}
	
	def rowIndex(int idx) {
		return idx / 4
	}
	
	def colIndex(int idx) {
		return idx % 4
	} 
	
	def generatePreview(Model m) '''
	«IF m.assembly != null»
	«m.assembly.handleLegoElementStart(true)»
	«m.assembly.handleLegoElementEnd»
	«ELSE»
		<GridPane vgap="10" hgap="10">
		«var index = 0»
		«FOR item : m.repo.elementList»
			<children>
				«item.handleLegoElementStart(false)» GridPane.columnIndex="«colIndex(index)»" GridPane.rowIndex="«rowIndex(index++)»" «item.handleLegoElementEnd»
			</children>
		«ENDFOR»
		</GridPane>
	«ENDIF»
	'''
	
	def generateFXML(Assembly assembly) '''
	<?xml version="1.0" encoding="UTF-8"?>
	<?import javafx.scene.shape.*?>
	<?import javafx.scene.layout.*?>
	<?import javafx.scene.*?>
	<?import javafx.scene.transform.*?>
	«assembly.handleLegoElementStart(true)»
	«assembly.handleLegoElementEnd»
	'''
	
	def generateFXML(Item item) '''
	<?xml version="1.0" encoding="UTF-8"?>
	<?import javafx.scene.shape.*?>
	<?import javafx.scene.layout.*?>
	<?import javafx.scene.*?>
	<?import javafx.scene.transform.*?>
	«item.handleLegoElementStart(true)»
	«item.handleLegoElementEnd»
	'''
	
	def dispatch CharSequence handleLegoElementStart(LegoElement brick, boolean includeNS) '''
		<!-- START: Unsupported type «brick» 
	'''
	
	def dispatch CharSequence handleLegoElementEnd(LegoElement brick) '''
		END: Unsupported type «brick» -->
	'''
	
	def dispatch CharSequence handleLegoElementStart(Brick brick, boolean includeNS) '''
	<Group «IF includeNS»xmlns:fx="http://javafx.com/fxml/1"«ENDIF» id="«brick.name»"
	'''
	
	def dispatch CharSequence handleLegoElementEnd(Brick brick) '''
	>
		«IF brick.source instanceof FxmlInclude»
			«(brick.source as FxmlInclude).load(new FileReader((brick.source as FxmlInclude).source2d))»
		«ELSE»
			<Rectangle  width="«brick.XUnits.toPixel»" height="«brick.YUnits.toPixel»" fill="«brick.fill.toHex»" />
		«ENDIF»
	</Group>
	'''
	
	def dispatch CharSequence handleLegoElementStart(Door brick, boolean includeNS) '''
	<Group «IF includeNS»xmlns:fx="http://javafx.com/fxml/1"«ENDIF» id="«brick.name»"
	'''
	
	def dispatch CharSequence handleLegoElementEnd(Door brick) '''
	>
		<Rectangle layoutX="3" layoutY="3" width="«brick.XUnits.toPixel - 2 * 3»" height="«brick.YUnits.toPixel - 2 * 3»" fill="«brick.fill.toHex»" />
	</Group>
	'''
	
	def dispatch CharSequence handleLegoElementStart(Assembly assembly, boolean includeNS) '''
	<Group «IF includeNS»xmlns:fx="http://javafx.com/fxml/1"«ENDIF» id="«assembly.name»"
	'''
	
	def dispatch CharSequence handleLegoElementEnd(Assembly assembly) '''
	>
		«FOR i : assembly.items»
			«IF i.transform != null»
			<Group>
			«ENDIF»
				«i.element.handleLegoElementStart(false)» layoutX="«i.XUnits.toPixel»" layoutY="«i.YUnits.toPixel»"
				«i.element.handleLegoElementEnd()»
			«IF i.transform != null»
				<transforms>
					«IF i.transform == "rotate180"»
					<Affine mxx="-1" myx="0" mxy="0" myy="1" tx="«i.element.width»" ty="0" />
					<Translate x="«(i.element.width-1.toXPixel)*-1»"/>
					«ENDIF»
				</transforms>
			</Group>
			«ENDIF»
		«ENDFOR»
	</Group>
	'''
}