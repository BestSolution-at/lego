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
import at.bestsolution.lego.lego.LegoElement
import at.bestsolution.lego.lego.Brick
import at.bestsolution.lego.lego.Door
import java.io.FileReader

import static extension com.google.common.io.CharStreams.*
import at.bestsolution.lego.lego.FxmlInclude

class Util {
	def load(FxmlInclude include, FileReader f) {
		return f.readLines.filter[x|!x.trim.startsWith("<?") && ! x.trim.startsWith("<svg") && ! x.trim.startsWith("</svg")].map[x|x.replace('diffuseColor="#ff0000"','diffuseColor="'+(include.eContainer as Brick).fill.toHex+'"').replace('fill="#ff0000"','fill="'+(include.eContainer as Brick).fill.toHex+'"')].join("\n")
	}
	
	def dispatch width(LegoElement e) {
		return 0
	}
	
	def dispatch width(Brick e) {
		return e.XUnits.toPixel
	}
	
	def dispatch width(Door e) {
		return e.XUnits.toPixel
	}
	
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