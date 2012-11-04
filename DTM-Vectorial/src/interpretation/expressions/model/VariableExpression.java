package interpretation.expressions.model;

import model.variables.Variable;
import interpretation.Context;
import model.ModelObject;

/**
* @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
* @version 1.0
*/
public abstract class VariableExpression extends ModelExpression {

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
		for(ModelObject v : this.generateModelObjects(context)){
			context.getModel().putVariable(
					(Variable) v);
		}	
	}
	
}
