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
import at.bestsolution.lego.lego.RoundBrick
import at.bestsolution.lego.lego.Item
import at.bestsolution.lego.lego.DoorBrick
import at.bestsolution.lego.lego.Door
import at.bestsolution.lego.lego.Assembly

class Lego2dFXML implements IGenerator {
	@Inject
	@Extension
	Util util
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val m = input.contents.head as Model
		if( m.assembly != null ) {
			
		} else {
			m.repo.elementList.forEach[
				fsa.generateFile(it.name+".fxml",generateFXML)
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
	<?xml version="1.0" encoding="UTF-8"?>
	<?import javafx.scene.shape.*?>
	<?import javafx.scene.layout.*?>
	<?import javafx.scene.*?>
	<?import javafx.scene.transform.*?>
	«IF m.assembly != null»
	«m.assembly.handleLegoElementStart(true)»
	«m.assembly.handleLegoElementEnd»
	«ELSE»
		<GridPane xmlns:fx="http://javafx.com/fxml/1" vgap="10" hgap="10">
		«var index = 0»
		«FOR item : m.repo.elementList»
			<children>
				«item.handleLegoElementStart(false)» GridPane.columnIndex="«colIndex(index)»" GridPane.rowIndex="«rowIndex(index++)»" «item.handleLegoElementEnd»
			</children>
		«ENDFOR»
		</GridPane>
	«ENDIF»
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
	<Rectangle «IF includeNS»xmlns:fx="http://javafx.com/fxml/1"«ENDIF» width="«brick.XUnits.toPixel»" height="«brick.YUnits.toPixel»" fill="«brick.fill.toHex»"
	'''
	
	def dispatch CharSequence handleLegoElementEnd(Brick brick) '''
	/>
	'''
	
	def dispatch CharSequence handleLegoElementStart(RoundBrick brick, boolean includeNS) '''
	<Path «IF includeNS»xmlns:fx="http://javafx.com/fxml/1"«ENDIF» fill="«brick.fill.toHex»" strokeWidth="0"
	'''
	
	def dispatch CharSequence handleLegoElementEnd(RoundBrick brick) '''
	>
	<elements>
			<MoveTo x="0" y="0" />
			<LineTo x="0" y="«brick.YUnits.toPixel*-1»" />
			<LineTo x="«brick.XUnits.toPixel»" y="«brick.YUnits.toPixel*-1»" />
			<LineTo x="«brick.XUnits.toPixel+1.toXPixel»" y="0" />
			<ClosePath />
		</elements>
	</Path>
	'''
	
	def dispatch CharSequence handleLegoElementStart(DoorBrick brick, boolean includeNS) '''
	<Group «IF includeNS»xmlns:fx="http://javafx.com/fxml/1"«ENDIF»
	'''
	
	def dispatch CharSequence handleLegoElementEnd(DoorBrick brick) '''
	>
		<Rectangle layoutY="0" width="«brick.XUnits.toPixel»" height="5" fill="«brick.fill.toHex»"/>
		<Rectangle layoutY="«brick.YUnits.toPixel-5»" width="«brick.XUnits.toPixel»" height="5" fill="«brick.fill.toHex»"/>
		<Rectangle layoutX="0" height="«brick.YUnits.toPixel»" width="5" fill="«brick.fill.toHex»"/>
		<Rectangle layoutX="«brick.XUnits.toPixel-5»" height="«brick.YUnits.toPixel»" width="5" fill="«brick.fill.toHex»"/>
	</Group>
	'''
	
	def dispatch CharSequence handleLegoElementStart(Door brick, boolean includeNS) '''
	<Group «IF includeNS»xmlns:fx="http://javafx.com/fxml/1"«ENDIF»
	'''
	
	def dispatch CharSequence handleLegoElementEnd(Door brick) '''
	>
		<Rectangle layoutX="3" layoutY="3" width="«brick.XUnits.toPixel - 2 * 3»" height="«brick.YUnits.toPixel - 2 * 3»" fill="«brick.fill.toHex»" />
	</Group>
	'''
	
	def dispatch CharSequence handleLegoElementStart(Assembly brick, boolean includeNS) '''
	<Group «IF includeNS»xmlns:fx="http://javafx.com/fxml/1"«ENDIF»
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
					«IF i.transform == "mirror-x"»
					<Affine mxx="-1" myx="0" mxy="0" myy="1" tx="90" ty="0" />
					«ENDIF»
				</transforms>
			</Group>
			«ENDIF»
		«ENDFOR»
	</Group>
	'''
}