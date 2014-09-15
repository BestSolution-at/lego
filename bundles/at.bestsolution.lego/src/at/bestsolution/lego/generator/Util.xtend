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