package interpretation.expressions.terminal.variables;

import model.variables.Shape;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EShape extends VariableExpression {

	public EShape(String name) {
		super(name);
	}

	public void interpret(Context context) {
		Shape var = new Shape(this.getName());
		context.getModel().putVariable(var);
	}

}
