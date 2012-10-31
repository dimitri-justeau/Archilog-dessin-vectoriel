package interpretation.expressions.terminal.variables;

import model.variables.Color;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EColor extends VariableExpression {

	int R,G,B;
	
	public EColor(String name, int R, int G, int B) {
		super(name);
		this.R = R;
		this.G = G;
		this.B = B;
	}

	public void interpret(Context context) {
		Color var = new Color(name, R, G, B);
		context.getModel().putVariable(var);
	}

}
