package at.bestsolution.lego.ui.preview

import com.google.inject.Inject
import at.bestsolution.lego.generator.Lego3dFXML
import at.bestsolution.lego.generator.Lego2dFXML
import at.bestsolution.lego.lego.Model

class PreviewGenerator {
	@Inject
	Lego3dFXML lego3d
	
	@Inject
	Lego2dFXML lego2
	
	def generatePreview(Model model) '''
	<?xml version="1.0" encoding="UTF-8"?>
	<?import javafx.scene.shape.*?>
	<?import javafx.scene.layout.*?>
	<?import javafx.scene.*?>
	<?import javafx.scene.transform.*?>
	<?import javafx.geometry.*?>
	<?import javafx.scene.paint.*?>
	<?import javafx.scene.control.*?>
	<TabPane xmlns:fx="http://javafx.com/fxml/1" side="BOTTOM" tabClosingPolicy="UNAVAILABLE">
«««		<Tab text="2d">
«««			<content>
«««				<ScrollPane>
«««					«lego2.generatePreview(model)»
«««				</ScrollPane>
«««			</content>
«««		</Tab>
		<Tab text="3d">
			<content>
				<ScrollPane>
					«lego3d.generatePreview(model)»
				</ScrollPane>
			</content>
		</Tab>
	</TabPane>
	'''
}