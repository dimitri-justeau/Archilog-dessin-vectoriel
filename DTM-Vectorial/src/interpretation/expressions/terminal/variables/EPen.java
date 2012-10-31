package interpretation.expressions.terminal.variables;

import model.variables.Color;
import model.variables.Pen;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EPen extends VariableExpression {

	String color, type;
	int stroke;
	
	public EPen(String name, String type, String color, int stroke) {
		super(name);
		this.type = type;
		this.color = color;
		this.stroke = stroke;
	}

	public void interpret(Context context) {
		Color c = (Color) context.getModel().getVariable(color);
		Pen p = new Pen(name, type, c, stroke);
		context.getModel().putVariable(p);
	}

}
