package interpretation.expressions.terminal.variables;

import model.variables.Pen;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EPen extends VariableExpression {

	public EPen(String name) {
		super(name);
	}

	public void interpret(Context context) {
		Pen var = new Pen(this.getName());
		context.getModel().putVariable(var);
	}

}
