package rendering.java2d;

import model.variables.Color;

public class Util {
	
	public static java.awt.Color getColorAwt(Color c){
		return new java.awt.Color(c.getR(), c.getG(), c.getB());
	}

}
