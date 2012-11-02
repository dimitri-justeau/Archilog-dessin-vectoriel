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
	public static AbstractExpression getExpression(String syntax, List<String> parameters){
		
		Sentence s = getSentence(syntax);
		
		AbstractExpression retour = null;
		if(s != null){
			switch(s){
			
			// VARIABLES
			case Picture:
				String name = parameters.get(0);
				double width = Double.parseDouble(parameters.get(1));
				double height = Double.parseDouble(parameters.get(2));
				retour = new EPicture(name, width, height);
				break;
				
			case Circle:
				name = parameters.get(0);
				String position = parameters.get(1);
				double rayon = Double.parseDouble(parameters.get(2));
				retour = new ECircle(name, position, rayon);
				break;
				
			case Color:
				name = parameters.get(0);
				int R = Integer.parseInt(parameters.get(1));
				int G = Integer.parseInt(parameters.get(2));
				int B = Integer.parseInt(parameters.get(3));
				retour = new EColor(name, R, G, B);
				break;

			case Path:
				name = parameters.get(0);
				List<String> points = new ArrayList<String>();
				for(int i=1; i<parameters.size();i++){
					points.add(parameters.get(i));
				}
				retour = new EPath(name, points);
				break;
				
			case Pen:
				name = parameters.get(0);
				String type = parameters.get(1);
				String color = parameters.get(2);
				int stroke = Integer.parseInt(parameters.get(3));
				retour = new EPen(name, type, color, stroke);
				break;
				
			case Point:
				name = parameters.get(0);
				int x = Integer.parseInt(parameters.get(1));
				int y = Integer.parseInt(parameters.get(2));
				retour = new EPoint(name, x, y);
				break;
				
			case Shape:
				name = parameters.get(0);
				points = new ArrayList<String>();
				for(int i=1; i<parameters.size();i++){
					points.add(parameters.get(i));
				}
				retour = new EShape(name, points);
				break;
				
			case Square:
				name = parameters.get(0);
				position = parameters.get(1);
				width = Double.parseDouble(parameters.get(2));
				retour = new ESquare(name, position, width);
				break;
			
			case Bezier:
				name = parameters.get(0);
				points = new ArrayList<String>();
				for(int i=1; i<parameters.size();i++){
					points.add(parameters.get(i));
				}
				retour = new EBezier(name, points);
				break;
			
			case Polygon:
				name = parameters.get(0);
				points = new ArrayList<String>();
				for(int i=1; i<parameters.size();i++){
					points.add(parameters.get(i));
				}
				retour = new EPolygon(name, points);
				break;
				
			// FUNCTIONS	
			case drawPath:
				String picture = parameters.get(0);
				String path = parameters.get(1);
				String pen = parameters.get(2);
				color = parameters.get(3);
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
	
	public static boolean isSingleLineInstruction(String syntax){
		Sentence s = getSentence(syntax);
		return (s!=null && s!=If && s!=For);
	}
	
	private static Sentence getSentence(String syntax){
		Sentence s = null;
		if(syntax == "if"){
			s = If;
		}
		else
		if(syntax == "for"){
			s = For;
		}
		else{
			try{
				s = Sentence.valueOf(syntax);
			}
			catch(Exception e){
			}
		}
		return s;
	}
	
}