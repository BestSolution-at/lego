package at.bestsolution.lego.generator

import at.bestsolution.lego.lego.Action
import at.bestsolution.lego.lego.Assembly
import at.bestsolution.lego.lego.Model
import at.bestsolution.lego.lego.MountedAssemblyItem
import at.bestsolution.lego.lego.RasterAssemblyItem
import java.util.HashSet
import java.util.Set
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import java.util.LinkedHashSet

class Lego3dJavaScript implements IGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		val m = input.contents.head as Model
		if( m.assembly != null ) {
			val actions = new LinkedHashSet<Action>;
			collectActions(m.assembly,actions)
			if( ! actions.empty ) {
				val items = new LinkedHashSet<MountedAssemblyItem>
				collectItems(m.assembly,items)
				fsa.generateFile("3d/" + m.assembly.name + ".js", actions.generateJS(items))	
			}
		}	
	}
	
	def void collectActions(Assembly a, Set<Action> items) {
		a.eAllContents.filter[ e | e instanceof MountedAssemblyItem ].map[e | return e as MountedAssemblyItem].forEach[e | items.addAll(e.actions)]
		a.eAllContents.filter[e | e instanceof RasterAssemblyItem && (e as RasterAssemblyItem).element instanceof Assembly].forEach[e|((e as RasterAssemblyItem).element as Assembly).collectActions(items)]
	}
	
	def void collectItems(Assembly a, Set<MountedAssemblyItem> items) {
		items.addAll(a.eAllContents.filter[ e | e instanceof MountedAssemblyItem ].map[e | return e as MountedAssemblyItem].toList)
		a.eAllContents.filter[e | e instanceof RasterAssemblyItem && (e as RasterAssemblyItem).element instanceof Assembly].forEach[e|((e as RasterAssemblyItem).element as Assembly).collectItems(items)]
	}
	
	def generateJS(HashSet<Action> actions, HashSet<MountedAssemblyItem> items) '''
	var Media 		= Java.type("javafx.scene.media.Media");
	var MediaPlayer = Java.type("javafx.scene.media.MediaPlayer");
	var Transition 	= Java.type("org.eclipse.fx.ui.animation.BaseTransition");
	var BiConsumer 	= Java.type("java.util.function.BiConsumer");
	var Duration 	= Java.type("javafx.util.Duration");
	
	var PropertyTransition = Java.extend(Transition);
	var basePath;
			
	function getRotateNode(node) {
		return node.getParent().getParent();
	}
			
	function getTransform(node,x,y,z) {
		for( var i = 0; i < node.getTransforms().size(); i++ ) {
			var t = node.getTransforms().get(i);
			if( t.getClass().getSimpleName().equals("Rotate") ) {
				if( t.getAxis().getX() == x 
					&& t.getAxis().getY() == y
					&& t.getAxis().getZ() == z ) {
					return t;
				}
			}
		}
		return null;
	}
	
	function rotate(r, targetAngle, soundFile, duration) {
		if( r != null ) {
			var start = r.getAngle();
			var delta = start - targetAngle;
			var transition = new PropertyTransition(Duration.millis(duration)) {
				interpolate: function(frac) {
					r.setAngle(start - frac * delta);
				}
			};
			transition.play();
			if( soundFile != null ) {
				var m = new Media(soundFile);
				var mediaPlayer = new MediaPlayer(m);
				mediaPlayer.play();
			}
		} 
	}
	
	«FOR ac : actions»
		function «ac.name»(event) {
			var node = getRotateNode(event.target);
			«IF ac.axis == "x"»
			rotate(getTransform(node, 1, 0, 0),«ac.angle», «IF ac.soundfile != null»basePath +"/«ac.soundfile»"«ELSE»null«ENDIF»,«ac.duration»);
			«ELSEIF ac.axis == "y"»
			rotate(getTransform(node, 0, 1, 0),«ac.angle», «IF ac.soundfile != null»basePath +"/«ac.soundfile»"«ELSE»null«ENDIF»,«ac.duration»);
			«ELSE»
			rotate(getTransform(node, 0, 0, 1),«ac.angle», «IF ac.soundfile != null»basePath +"/«ac.soundfile»"«ELSE»null«ENDIF»,«ac.duration»);
			«ENDIF»
		}
	«ENDFOR»
	
	function init() {
		var InitComsumer = Java.extend(BiConsumer);
		return new InitComsumer() {
			accept : function(n,l) {
				basePath = l;
				
				«FOR mi : items»
				{
					var dynamicNode = n.lookup("#dynamic_«mi.element.name»");
					if( dynamicNode != null ) {
						var c_«mi.element.name» = 0;
						dynamicNode.setOnMousePressed(function(event) {
							«var count = 0»
							«FOR a : actions»
							if( c_«mi.element.name» % «actions.length» == «count++» ) {
								«a.name»(event);
							}
							«ENDFOR»
							c_«mi.element.name»++;
						});
					}
				}
				«ENDFOR»
			}
		};
	}
	
	init();
	'''
}