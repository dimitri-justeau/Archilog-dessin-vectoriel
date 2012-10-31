package interpretation.parsing;

import interpretation.expressions.AbstractExpression;
import interpretation.expressions.terminal.EPicture;
import interpretation.expressions.terminal.variables.EColor;
import interpretation.expressions.terminal.variables.EPen;
import interpretation.expressions.terminal.variables.EPoint;

import java.util.List;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:09
 */
public enum Sentence {

	Picture, /*done*/
	
	// VARIABLES
	Point, /*done*/
	Pen, /*done*/
	Color, /*done*/
	Path,
	Shape,
	Circle,
	
	// FUNCTIONS
	drawPath,
	drawSmiley,
	
	// OPERATORS
	If,
	For,
	
	;

	/**
	 * 
	 * @param syntax
	 * @param parameters
	 */
	public static AbstractExpression getExpression(String syntax, List<Object> parameters){
		Sentence s = Sentence.valueOf(syntax);
		AbstractExpression retour = null;
		if(s != null){
			switch(s){
			case Picture:
				String name = (String) parameters.get(0);
				double width = (Double) parameters.get(1);
				double height = (Double) parameters.get(2);
				retour = new EPicture(name, width, height);
				break;
			case Circle:
				break;
			case Color:
				name = (String) parameters.get(0);
				int R = (Integer) parameters.get(1);
				int G = (Integer) parameters.get(2);
				int B = (Integer) parameters.get(3);
				retour = new EColor(name, R, G, B);
				break;
			case For:
				break;
			case If:
				break;
			case Path:
				break;
			case Pen:
				name = (String) parameters.get(0);
				String type = (String) parameters.get(1);
				String color = (String) parameters.get(2);
				int stroke = (Integer) parameters.get(3);
				retour = new EPen(name, type, color, stroke);
				break;
			case Point:
				name = (String) parameters.get(0);
				int x = (Integer) parameters.get(1);
				int y = (Integer) parameters.get(2);
				retour = new EPoint(name, x, y);
				break;
			case Shape:
				break;
			case drawPath:
				break;
			case drawSmiley:
				break;
			default:
				break;
			}
		}	
		return retour;
	}
}