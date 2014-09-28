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

function OpenDoor(event) {
	var node = getRotateNode(event.target);
	rotate(getTransform(node, 0, 1, 0),80.0, basePath +"/squeaking-door.mp3",3000);
}
function CloseDoor(event) {
	var node = getRotateNode(event.target);
	rotate(getTransform(node, 0, 1, 0),180.0, basePath +"/slam-door.mp3",2000);
}

function init() {
	var InitComsumer = Java.extend(BiConsumer);
	return new InitComsumer() {
		accept : function(n,l) {
			basePath = l;
			
			{
				var dynamicNode = n.lookup("#dynamic_Door_brown");
				if( dynamicNode != null ) {
					var c_Door_brown = 0;
					dynamicNode.setOnMousePressed(function(event) {
						if( c_Door_brown % 2 == 0 ) {
							OpenDoor(event);
						}
						if( c_Door_brown % 2 == 1 ) {
							CloseDoor(event);
						}
						c_Door_brown++;
					});
				}
			}
		}
	};
}

init();
