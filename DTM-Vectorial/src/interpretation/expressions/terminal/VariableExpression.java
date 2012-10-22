package interpretation.expressions.terminal;

import interpretation.expressions.TerminalExpression;

/**
* @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
* @version 1.0
*/
public abstract class VariableExpression extends TerminalExpression {

	/** 
	 * Le nom de la variable correspondante
	 */
	private String name;
	
	public VariableExpression(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
