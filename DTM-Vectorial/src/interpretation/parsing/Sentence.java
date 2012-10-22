package interpretation.parsing;

import interpretation.expressions.AbstractExpression;

import java.util.List;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:09
 */
public enum Sentence {

	// VARIABLES
	Point,
	Pen,
	Color,
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
	public AbstractExpression getExpression(String syntax, List<Object> parameters){
		return null;

	}

	/**
	 * 
	 * @param parameters
	 */
	private AbstractExpression generateExpression(List<Object> parameters){
		return null;
	}
}