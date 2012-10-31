package interpretation.expressions.terminal.variables;

import model.variables.Point;
import model.variables.Square;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;
/**
 * Classe abstraite pour desinner un carré
 * @author Andres Gutierrez
 *
 */
public class ESquare extends VariableExpression {

	String position;
	double width;
	
	public ESquare(String name, String position, double width) {
		super(name);
		this.position = position;
		this.width = width;
	}

	public void interpret(Context context) {
		Point pos = (Point) context.getModel().getVariable(position);
		Square var = new Square(name, pos, width);
		context.getModel().putVariable(var);
	}

}
