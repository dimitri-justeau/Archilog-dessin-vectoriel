package interpretation.expressions.terminal.variables;

import model.variables.Path;

import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EPath extends VariableExpression {

	public EPath(String name) {
		super(name);
	}

	public void interpret(Context context) {
		Path var = new Path(this.getName());
		context.getModel().putVariable(var);
	}

}
