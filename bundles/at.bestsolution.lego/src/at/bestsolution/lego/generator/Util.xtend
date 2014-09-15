package at.bestsolution.lego.generator

import at.bestsolution.lego.lego.XUnit
import at.bestsolution.lego.lego.YUnit
import at.bestsolution.lego.lego.Color

class Util {
	def toPixel(XUnit u) {
		return u.units.toXPixel
	}
	
	def toPixel(YUnit u) {
		return u.units.toYPixel
	}
	
	def toXPixel(int u) {
		return u * 30
	}
	
	def toYPixel(int u) {
		return u * 20
	}
	
	def toHex(Color c) {
		return "#" + toHex(c.r) + toHex(c.g) + toHex(c.b)
	}
	
	def static toHex(int i) {
		val v = Integer.toHexString(i)
		if( v.length == 1 ) {
			return "0"+v
		}
		return v
	}
}