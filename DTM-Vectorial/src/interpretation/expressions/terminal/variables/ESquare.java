package interpretation.expressions.terminal.variables;

import model.variables.Square;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;
/**
 * Classe abstraite pour desinner un carr�
 * @author Andres Gutierrez
 *
 */
public class ESquare extends VariableExpression {

	/**
	 * M�thode constructeur d'une Variable
	 * @param name
	 */
	public ESquare(String name) {
		super(name);
	}
	/**
	 * 
	 */
	public void interpret(Context context) {
		Square var = new Square(this.getName());
		context.getModel().putVariable(var);
	}

}
