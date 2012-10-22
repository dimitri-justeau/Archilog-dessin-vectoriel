package interpretation.expressions.terminal.variables;

import model.variables.Polygon;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EPolygon extends VariableExpression {

	public EPolygon(String name) {
		super(name);
	}

	public void interpret(Context context) {
		Polygon var = new Polygon(this.getName());
		context.getModel().putVariable(var);
	}

}
