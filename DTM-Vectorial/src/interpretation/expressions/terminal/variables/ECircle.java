package interpretation.expressions.terminal.variables;

import model.variables.Circle;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class ECircle extends VariableExpression {

	public ECircle(String name) {
		super(name);
	}

	public void interpret(Context context) {
		Circle var = new Circle(this.getName());
		context.getModel().putVariable(var);
	}

}
