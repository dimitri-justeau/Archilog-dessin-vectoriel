package interpretation.expressions.terminal.variables;

import model.variables.Point;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EPoint extends VariableExpression {

	int x, y;
	
	public EPoint(String name, int x, int y) {
		super(name);
		this.x = x;
		this.y = y;
	}

	public void interpret(Context context) {
		Point p = new Point(name, x, y);
		context.getModel().putVariable(p);
	}

}
