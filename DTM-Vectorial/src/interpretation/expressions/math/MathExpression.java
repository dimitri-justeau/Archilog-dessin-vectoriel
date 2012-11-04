package interpretation.expressions.math;

import interpretation.Context;
import interpretation.expressions.AbstractExpression;

public abstract class MathExpression extends AbstractExpression{

	public abstract void interpret(Context context);

}
