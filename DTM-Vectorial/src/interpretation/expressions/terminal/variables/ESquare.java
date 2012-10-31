package interpretation.expressions.terminal.variables;

import model.variables.Square;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;
/**
 * Classe abstraite pour desinner un carré
 * @author Andres Gutierrez
 *
 */
public class ESquare extends VariableExpression {

	public ESquare(String name) {
		super(name);
	}

	public void interpret(Context context) {

	}

}
