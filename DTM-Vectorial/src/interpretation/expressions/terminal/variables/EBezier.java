package interpretation.expressions.terminal.variables;

import model.variables.Bezier;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EBezier extends VariableExpression {

	public EBezier(String name) {
		super(name);
	}

	public void interpret(Context context) {
		Bezier var = new Bezier(this.getName());
		context.getModel().putVariable(var);
	}

}