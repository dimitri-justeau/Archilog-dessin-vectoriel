package interpretation.expressions.terminal.variables;

import model.variables.Color;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EColor extends VariableExpression {

	public EColor(String name) {
		super(name);
	}

	public void interpret(Context context) {
		Color var = new Color(this.getName());
		context.getModel().putVariable(var);
	}

}
