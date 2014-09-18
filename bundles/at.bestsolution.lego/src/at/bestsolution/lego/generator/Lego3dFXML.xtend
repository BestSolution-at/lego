/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GPL v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.lego.generator

import at.bestsolution.lego.lego.Assembly
import at.bestsolution.lego.lego.Brick
import at.bestsolution.lego.lego.FxmlInclude
import at.bestsolution.lego.lego.ItemRepository
import at.bestsolution.lego.lego.Model
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import java.io.FileReader
import at.bestsolution.lego.lego.RepostoryItem
import at.bestsolution.lego.lego.RasterAssemblyItem
import at.bestsolution.lego.lego.RasterItem

class Lego3dFXML implements IGenerator {
	@Inject
	@Extension
	Util util

	val showAxis = false;
	val showOrigin = true;
	
	val P = 16;
	val off = 0.2;
	val r = 4.8;
	val rh = 3.4;
	val H = 9.6;
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val m = input.contents.head as Model
		if( m.assembly != null ) {
			fsa.generateFile("3d/" + m.assembly.name + ".fxml", m.assembly.generateFXML)
		} else {
			m.repo.elementList.forEach[
				fsa.generateFile("3d/" + it.name+".fxml", it.generateFXML)
			]
		}		
	}
	
	def rowIndex(int idx) {
		return idx / 4
	}
	
	def colIndex(int idx) {
		return idx % 4
	} 
	
	def toColor(RepostoryItem item) '''
	rgb(«item.fill.r», «item.fill.g», «item.fill.b»)
	'''
		
	def width(Brick brick) {
		return brick.XUnits.units * P - 2 * off;
	}
	def height(Brick brick) {
		return brick.YUnits.units * H
	}
	def depth(Brick brick) {
		return brick.ZUnits.units * P - 2 * off;
	}
	
	def generatedAssembly(Assembly a) '''
	<Group>
		«FOR x : a.items»
			<Group>
				«IF x.element instanceof Brick»
					«createBrick(x.element as Brick)»
				«ELSEIF x.element instanceof Assembly»
					«generatedAssembly(x.element as Assembly)»
				«ENDIF»
				«IF x instanceof RasterAssemblyItem»
				<transforms>
					<Translate x="«x.XUnits.units * P»" y="«x.YUnits.units * H»" z="«x.ZUnits.units * P»" />
					«IF x.transform == "rotate180"»
						<Rotate angle="180" >
						 <axis><Point3D x="0" y="1" z="0"/></axis>
						</Rotate>
					«ELSEIF x.transform == "rotate90"»
						<Rotate angle="90" >
						 <axis><Point3D x="0" y="1" z="0"/></axis>
						</Rotate>
					«ELSEIF x.transform == "rotate270"»
						<Rotate angle="270" >
						 <axis><Point3D x="0" y="1" z="0"/></axis>
						</Rotate>
					«ENDIF»
					
				</transforms>
				«ENDIF»
			</Group>
			
		«ENDFOR»
	</Group>
	'''
	
	def generateAssemblyPreview(Assembly a) '''
		«var scale = 2»
		<BorderPane>
		<center>
		
			<SubScene width="400" height="400" depthBuffer="true">
				<antiAliasing>
					<SceneAntialiasing fx:constant="BALANCED" />
				</antiAliasing>
				<camera>
					<ParallelCamera>
						<transforms>
							««« move origin to center of stone
«««							<Translate x="«brick.width()/2.0 * scale»" y="«(-brick.height())/2.0 * scale»" z="«brick.depth()/2.0 * scale»" />
						
							««« rotate
							<Rotate angle="45" >
							 <axis><Point3D x="0" y="1" z="0"/></axis>
							</Rotate>
							<Rotate angle="-45" >
							 <axis><Point3D x="1" y="0" z="0"/></axis>
							</Rotate>
							<Rotate angle="0" >
							 <axis><Point3D x="0" y="0" z="1"/></axis>
							</Rotate>
						
							««« move to center
							<Translate x="-200" y="-200" z="00" />
						</transforms>
					</ParallelCamera>
				</camera>
				<root>
					<Group>
						<transforms>
							<Scale x="«scale»" y="«scale»" z="«scale»" />
						</transforms>
						«generatedAssembly(a)»
					</Group>
				</root>
			</SubScene>
		
		</center>
		</BorderPane>
	'''
	def generatePreview(Model m) {
		if (m.assembly != null) {
			return generateAssemblyPreview(m.assembly);
		}
		else {
			return generateRepo(m.repo);
		}
	}
	def generateRepo(ItemRepository m) '''
	<BorderPane>
	<center>
	<GridPane vgap="10" hgap="10" >
	«var scale = 2»
	«var index = 0»
	«FOR item : m.elementList»
		«IF item instanceof Brick»
		«val brick = item as Brick»
		<children>
			<SubScene width="200" height="200" GridPane.columnIndex="«colIndex(index)»" GridPane.rowIndex="«rowIndex(index++)»" depthBuffer="true">
				<antiAliasing>
					<SceneAntialiasing fx:constant="BALANCED" />
				</antiAliasing>
				<camera>
					<ParallelCamera>
						<transforms>
							««« move origin to center of stone
							<Translate x="«brick.width()/2.0 * scale»" y="«(-brick.height())/2.0 * scale»" z="«brick.depth()/2.0 * scale»" />
						
							««« rotate
							<Rotate angle="45" >
							 <axis><Point3D x="0" y="1" z="0"/></axis>
							</Rotate>
							<Rotate angle="-45" >
							 <axis><Point3D x="1" y="0" z="0"/></axis>
							</Rotate>
							<Rotate angle="0" >
							 <axis><Point3D x="0" y="0" z="1"/></axis>
							</Rotate>
						
							««« move to center
							<Translate x="-100" y="-100" z="00" />
						</transforms>
					</ParallelCamera>
				</camera>
				<root>
					<Group>
						<transforms>
							<Scale x="«scale»" y="«scale»" z="«scale»" />
						</transforms>
						«IF showAxis»
							«createAxis()»
						«ENDIF»
						«IF showOrigin»
							«createOrigin()»
						«ENDIF»
						«createBrick(item as Brick)»
					</Group>
				</root>
			</SubScene>
		</children>
		«ENDIF»
	«ENDFOR»
	</GridPane>
	</center>
	</BorderPane>
	'''
	
	def createAxis() '''
		<Group>
							<Box width="100" depth="1" height="1">
								<material>
									<PhongMaterial diffuseColor="red" />
								</material>
								<transforms>
									<Translate x="50" />
								</transforms>
							</Box>
							
							<Box width="1" depth="1" height="100">
								<material>
									<PhongMaterial diffuseColor="lightgreen" />
								</material>
								<transforms>
									<Translate y="50" />
								</transforms>
							</Box>
							
							<Box width="1" depth="100" height="1">
								<material>
									<PhongMaterial diffuseColor="blue" />
								</material>
								<transforms>
									<Translate z="50" />
								</transforms>
							</Box>
						
						</Group>
	'''
	
	def createOrigin() '''
		<Group>
							<Box width="0.5" depth="0.5" height="150">
								<material>
									<PhongMaterial diffuseColor="lightgray" />
								</material>
								<transforms>
									<Translate y="-75" />
								</transforms>
							</Box>
						</Group>
	'''
	
	def createBrick(Brick brick) '''
	«IF brick.source instanceof FxmlInclude»
	«val fxml = brick.source as FxmlInclude»
	<Group id="«brick.name»">
		«fxml.load(new FileReader(fxml.source3d))»
		<transforms>
			««« to origin
			<Translate x="«fxml.originX»" y="«fxml.originY»" z="«fxml.originZ»" />
		</transforms>
	</Group>
	«ELSE»
	<Group id="«brick.name»">
		<Box width="«brick.width»" depth="«brick.depth»" height="«brick.height»">
			<material>
				<PhongMaterial diffuseColor="«brick.toColor()»"/>
			</material>
			<transforms>
				««« to edge
				<Translate x="«brick.width() / 2.0»" y="«-brick.height() / 2.0»" z="«brick.depth() / 2.0»" />
				««« to origin
				<Translate x="«-(P/2.0-off)»" z="«-(P/2.0-off)»" />
			</transforms>
		</Box>
		«FOR iX : (1..brick.XUnits.units)»
			«FOR iZ : (1..brick.ZUnits.units)»
				<Cylinder radius="«r»" height="«rh»">
					<material>
						<PhongMaterial diffuseColor="«brick.toColor()»"/>
					</material>
					<transforms>
						<Translate x="« P/2.0 + (iX-1) * P - off»" y="«-brick.height - rh/2»" z="« P/2.0 + (iZ-1) * 16 - off»" />
						««« to origin
						<Translate x="«-(P/2.0-off)»" z="«-(P/2.0-off)»" />
					</transforms>
				</Cylinder>
			«ENDFOR»
		«ENDFOR»
	</Group>
	«ENDIF»
	'''
	def generateFXML(Assembly a) '''
	<?xml version="1.0" encoding="UTF-8"?>
	<?import javafx.scene.shape.*?>
	<?import javafx.scene.layout.*?>
	<?import javafx.scene.*?>
	<?import javafx.scene.transform.*?>
	<?import javafx.geometry.*?>
	<?import javafx.scene.paint.*?>
	
	<Group xmlns:fx="http://javafx.com/fxml/1">
		«generatedAssembly(a)»
	</Group>
	'''
	
	def generateFXML(RepostoryItem item) '''
	<?xml version="1.0" encoding="UTF-8"?>
	<?import javafx.scene.shape.*?>
	<?import javafx.scene.layout.*?>
	<?import javafx.scene.*?>
	<?import javafx.scene.transform.*?>
	<?import javafx.geometry.*?>
	<?import javafx.scene.paint.*?>
	
	<Group xmlns:fx="http://javafx.com/fxml/1">
	«IF item instanceof Brick»
		«createBrick(item as Brick)»
«««	«ELSEIF »
	«ENDIF»
	</Group>
	'''
}