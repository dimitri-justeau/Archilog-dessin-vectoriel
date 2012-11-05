package interpretation.expressions.model.operators;

import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import interpretation.Context;
import interpretation.expressions.AbstractExpression;
import interpretation.expressions.model.InstructionExpression;

public class EIfElse extends InstructionExpression{
	
	private List<AbstractExpression> expressionsBlocTrue, expressionBlocFalse;
	private String assertion;
	
	public EIfElse(String a, List<AbstractExpression> e1, List<AbstractExpression> e2){
		this.assertion = a;
		this.expressionsBlocTrue = e1;
		this.expressionBlocFalse = e2;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		boolean b;
		try {
			b = context.getMathModel().evaluate(assertion);
			if(b){
				return this.generateBlocs(context, expressionsBlocTrue);
			}
			else{
				return this.generateBlocs(context, expressionBlocFalse);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
