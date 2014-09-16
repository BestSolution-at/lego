package at.bestsolution.lego.generator

import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import at.bestsolution.lego.lego.Model
import at.bestsolution.lego.lego.Item
import at.bestsolution.lego.lego.Assembly
import at.bestsolution.lego.lego.LegoElement
import at.bestsolution.lego.lego.Brick
import at.bestsolution.lego.lego.RoundBrick
import at.bestsolution.lego.lego.DoorBrick
import at.bestsolution.lego.lego.Door

class Lego2dSVG implements IGenerator {
	@Inject
	@Extension
	Util util
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val m = input.contents.head as Model
		if( m.assembly != null ) {
			fsa.generateFile("2d/" + m.assembly.name+".svg",m.assembly.generateSVG)
		} else {
			m.repo.elementList.forEach[
				fsa.generateFile("2d/" + it.name+".svg",it.generateSVG)
			]
		}		
	}
	
	def generateSVG(Assembly assembly) '''
	<?xml version="1.0"?>
	<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
	«assembly.handleLegoElementStart»
	«assembly.handleLegoElementEnd»
	</svg>
	'''
	
	def generateSVG(Item item) '''
	<?xml version="1.0"?>
	<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
	«item.handleLegoElementStart»
	«item.handleLegoElementEnd»
	</svg>
	'''
	
	def dispatch CharSequence handleLegoElementStart(LegoElement brick) '''
	<!--
	'''
	
	def dispatch CharSequence handleLegoElementEnd(LegoElement brick) '''
	-->
	'''
	
	def dispatch CharSequence handleLegoElementStart(Brick brick) '''
	<rect id="«brick.name»" width="«brick.XUnits.toPixel»" height="«brick.YUnits.toPixel»" fill="«brick.fill.toHex»"
	'''
	
	def dispatch CharSequence handleLegoElementEnd(Brick brick) '''
	/>
	'''
	
	def dispatch CharSequence handleLegoElementStart(RoundBrick brick) '''
	<path id="«brick.name»" fill="«brick.fill.toHex»" stroke-width="0" 
		d="M 0 0 L «brick.XUnits.toPixel» 0 L «brick.XUnits.toPixel+1.toXPixel» «brick.YUnits.toPixel» L 0 «brick.YUnits.toPixel» z"
	'''
	
	def dispatch CharSequence handleLegoElementEnd(RoundBrick brick) '''
	/>
	'''
	
	def dispatch CharSequence handleLegoElementStart(DoorBrick brick) '''
	<g id="«brick.name»" 
	'''

	def dispatch CharSequence handleLegoElementEnd(DoorBrick brick) '''
	>
		<rect y="0" width="«brick.XUnits.toPixel»" height="5" fill="«brick.fill.toHex»"/>
		<rect y="«brick.YUnits.toPixel-5»" width="«brick.XUnits.toPixel»" height="5" fill="«brick.fill.toHex»"/>
		<rect x="0" height="«brick.YUnits.toPixel»" width="5" fill="«brick.fill.toHex»"/>
		<rect x="«brick.XUnits.toPixel-5»" height="«brick.YUnits.toPixel»" width="5" fill="«brick.fill.toHex»"/>
	</g>
	'''
	
	def dispatch CharSequence handleLegoElementStart(Door brick) '''
	<g id="«brick.name»" 
	'''
	
	def dispatch CharSequence handleLegoElementEnd(Door brick) '''
	>
		<rect x="3" y="3" width="«brick.XUnits.toPixel - 2 * 3»" height="«brick.YUnits.toPixel - 2 * 3»" fill="«brick.fill.toHex»" />
	</g>
	'''
	
	def dispatch CharSequence handleLegoElementStart(Assembly assembly) '''
	<g id="«assembly.name»" 
	'''
	
	def dispatch CharSequence handleLegoElementEnd(Assembly assembly) '''
	>
		«FOR i : assembly.items»
			«IF i.transform != null»
			<g transform="matrix(-1 0 0 1 «i.element.width» 0)">
			«ENDIF»
				«i.element.handleLegoElementStart» transform="translate(«i.XUnits.toPixel», «i.YUnits.toPixel»)"
				«i.element.handleLegoElementEnd»
			«IF i.transform != null»
			</g>
			«ENDIF»
		«ENDFOR»
	</g>
	'''
}