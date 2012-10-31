package interpretation.parsing;

import interpretation.expressions.AbstractExpression;

import java.util.List;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:00
 */
public interface Parser {

	/**
	 * 
	 * @param file
	 */
	public List<AbstractExpression> parse(String file);

}