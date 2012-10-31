package interpretation.expressions.terminal;

import interpretation.expressions.AbstractExpression;

public abstract class InstructionExpression extends AbstractExpression{

	protected String picture;
	
	public InstructionExpression(String picture){
		this.picture = picture;
	}

}
