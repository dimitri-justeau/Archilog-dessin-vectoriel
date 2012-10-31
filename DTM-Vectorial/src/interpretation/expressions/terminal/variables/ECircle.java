package interpretation.expressions.terminal.variables;

import model.variables.Circle;
import model.variables.Point;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class ECircle extends VariableExpression {

	String position;
	double rayon;
	
	public ECircle(String name, String position, double rayon) {
		super(name);
		this.position = position;
		this.rayon = rayon;
	}

	public void interpret(Context context) {
		Point center = (Point) context.getModel().getVariable(position);
		Circle var = new Circle(name, center, rayon);
		context.getModel().putVariable(var);
	}

}
