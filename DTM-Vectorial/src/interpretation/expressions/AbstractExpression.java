package interpretation.expressions;

import interpretation.Context;


/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:33
 */
public abstract class AbstractExpression {

	public AbstractExpression(){

	}

	/**
	 * 
	 * @param context
	 */
	public abstract void interpret(Context context);
}