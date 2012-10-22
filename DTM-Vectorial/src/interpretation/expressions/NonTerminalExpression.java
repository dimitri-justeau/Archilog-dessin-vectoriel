package interpretation.expressions;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:56
 */
public abstract class NonTerminalExpression extends AbstractExpression {

	public AbstractExpression expression;

	public NonTerminalExpression(AbstractExpression expression){
		this.expression = expression;
	}
}