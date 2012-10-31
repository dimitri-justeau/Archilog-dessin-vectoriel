package interpretation.parsing;

import interpretation.expressions.AbstractExpression;
import interpretation.expressions.terminal.variables.*;
import interpretation.expressions.terminal.functions.*;
import interpretation.expressions.terminal.*;

import java.util.ArrayList;
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
	Path, /*done*/
	Bezier, /*done*/
	Polygon, /*done*/
	Square, /*done*/
	Shape, /*done*/
	Circle, /*done*/
	
	// FUNCTIONS
	drawPath, /*done*/
	drawSmiley, // EN ATTENTE DU MODELE
	
	// OPERATORS
	If, // EN ATTENTE DU MODELE
	For, // EN ATTENTE DU MODELE
	
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
			
			// VARIABLES
			case Picture:
				String name = (String) parameters.get(0);
				double width = (Double) parameters.get(1);
				double height = (Double) parameters.get(2);
				retour = new EPicture(name, width, height);
				break;
				
			case Circle:
				name = (String) parameters.get(0);
				String position = (String) parameters.get(1);
				double rayon = (Double) parameters.get(2);
				retour = new ECircle(name, position, rayon);
				break;
				
			case Color:
				name = (String) parameters.get(0);
				int R = (Integer) parameters.get(1);
				int G = (Integer) parameters.get(2);
				int B = (Integer) parameters.get(3);
				retour = new EColor(name, R, G, B);
				break;

			case Path:
				name = (String) parameters.get(0);
				List<String> points = new ArrayList<String>();
				for(int i=1; i<parameters.size();i++){
					points.add((String) parameters.get(i));
				}
				retour = new EPath(name, points);
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
				name = (String) parameters.get(0);
				points = new ArrayList<String>();
				for(int i=1; i<parameters.size();i++){
					points.add((String) parameters.get(i));
				}
				retour = new EShape(name, points);
				break;
				
			case Square:
				name = (String) parameters.get(0);
				position = (String) parameters.get(1);
				width = (Double) parameters.get(2);
				retour = new ESquare(name, position, width);
				break;
			
			case Bezier:
				name = (String) parameters.get(0);
				points = new ArrayList<String>();
				for(int i=1; i<parameters.size();i++){
					points.add((String) parameters.get(i));
				}
				retour = new EBezier(name, points);
				break;
			
			case Polygon:
				name = (String) parameters.get(0);
				points = new ArrayList<String>();
				for(int i=1; i<parameters.size();i++){
					points.add((String) parameters.get(i));
				}
				retour = new EPolygon(name, points);
				break;
				
			// FUNCTIONS	
			case drawPath:
				String picture = (String) parameters.get(0);
				String path = (String) parameters.get(1);
				String pen = (String) parameters.get(2);
				color = (String) parameters.get(3);
				retour = new EDrawPath(picture, path, pen, color);
				break;
				
			case drawSmiley:
				break;
				
			// OPERATORS
			case For:
				break;
				
			case If:
				break;
				
			default:
				break;
			}
		}	
		return retour;
	}
}