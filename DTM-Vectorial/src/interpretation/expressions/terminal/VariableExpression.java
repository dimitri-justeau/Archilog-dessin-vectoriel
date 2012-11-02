package interpretation.expressions.terminal;

import model.*;
import interpretation.Context;
import interpretation.expressions.*;

/**
* @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
* @version 1.0
*/
public abstract class VariableExpression extends AbstractExpression {

	/** 
	 * Le nom de la variable correspondante
	 */
	protected String name;
	
	public VariableExpression(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}

	public final void interpret(Context context) {
		for(ModelObject v : this.generateModelObject(context)){
			context.getModel().putVariable(
					(Variable) v);
		}	
	}
	
}
