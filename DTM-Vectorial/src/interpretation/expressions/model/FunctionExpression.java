package interpretation.expressions.model;

public abstract class FunctionExpression extends InstructionExpression{

	protected String picture;
	
	public FunctionExpression(String picture){
		this.picture = picture;
	}
}
