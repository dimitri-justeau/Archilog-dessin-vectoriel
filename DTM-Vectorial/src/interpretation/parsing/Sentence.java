package interpretation.parsing;

import interpretation.expressions.AbstractExpression;
import interpretation.expressions.model.*;
import interpretation.expressions.model.functions.*;
import interpretation.expressions.model.operators.*;
import interpretation.expressions.model.variables.*;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

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
	drawSmiley, /*done*/
	drawLabel,
	
	// OPERATORS
	If, 
	For, /*done*/
	
	;

	/**
	 * Renvoie l'AbstractExpression correspondant à la syntaxe et au paramètres donnés
	 * @param syntax
	 * @param parameters
	 * @param 
	 * @throws ParseException 
	 */
	public static ModelExpression getExpression(String syntax, List<Object> parameters){
		
		Sentence s = getSentence(syntax);
		
		ModelExpression retour = null;
		if(s != null){
			switch(s){
			
			// VARIABLES
			case Picture:
				String name = (String) parameters.get(0);
				String width = (String) parameters.get(1);
				String height = (String) parameters.get(2);
				retour = new EPicture(name, width, height);
				break;
				
			case Circle:
				name = (String) parameters.get(0);
				String position = (String) parameters.get(1);
				String rayon = (String) parameters.get(2);
				retour = new ECircle(name, position, rayon);
				break;
				
			case Color:
				name = (String) parameters.get(0);
				String R = (String) parameters.get(1);
				String G = (String) parameters.get(2);
				String B = (String) parameters.get(3);
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
				String stroke = (String) parameters.get(2);
				retour = new EPen(name, type, stroke);
				break;
				
			case Point:
				name = (String) parameters.get(0);
				String x = (String) parameters.get(1);
				String y = (String) parameters.get(2);
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
				width = (String) parameters.get(2);
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
				String color = (String) parameters.get(3);
				retour = new EDrawPath(picture, path, pen, color);
				break;
				
			case drawSmiley:
				picture = (String) parameters.get(0);
				color = (String) parameters.get(1);
				String size = (String) parameters.get(2);
				position = (String) parameters.get(3);
				retour = new EDrawSmiley(picture, color, size, position);
				break;
			
			case drawLabel:
				picture = (String) parameters.get(0);
				color = (String) parameters.get(1);
				String size2 = (String) parameters.get(2);
				position = (String) parameters.get(3);
				String label = (String) parameters.get(4);
				retour = new EDrawLabel(picture, color, size2, position, label);
				break;
				
			// OPERATORS
			case For:
				String start = (String) parameters.get(0);
				String end = (String) parameters.get(1);
				String step = (String) parameters.get(2);
				List<AbstractExpression> expressions = new ArrayList<AbstractExpression>();
				for(int i=3; i<parameters.size(); i++){
					expressions.add((AbstractExpression) parameters.get(i));
				}
				retour = new EFor(start, end, step, expressions);
				break;
				
			case If:
				String assertion = (String) parameters.get(0);
				List<AbstractExpression> e1 = (List<AbstractExpression>) parameters.get(1);
				List<AbstractExpression> e2 = (List<AbstractExpression>) parameters.get(2);
				//retour = new EIfElse(assertion, e1, e2);
				break;
				
			default:
				break;
			}
		}	
		return retour;
	}
	
	/**
	 * @param syntax
	 * @return True si l'instruction est atomique (ie sur une seule ligne)
	 */
	public static boolean isSingleLineInstruction(String syntax){
		Sentence s = getSentence(syntax);
		return (s!=null && s!=If && s!=For);
	}
	
	/**
	 * @param syntax
	 * @return True si l'instruction n'est pas atomique, et qu'elle n'est 
	 * composée que d'un bloc d'instruction
	 */
	public static boolean isSingleBlocStructure(String syntax){
		Sentence s = getSentence(syntax);
		return (s == For);
	}
	
	/**
	 * @param syntax
	 * @return La Sentence correspondant au mot de syntaxe
	 */
	private static Sentence getSentence(String syntax){
		Sentence s = null;
		if(syntax.equals("if")){
			s = If;
		}
		else
		if(syntax.equals("for")){
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
