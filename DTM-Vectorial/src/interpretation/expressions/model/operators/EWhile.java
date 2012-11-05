package interpretation.expressions.model.operators;

import interpretation.Context;
import interpretation.expressions.AbstractExpression;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;

public class EWhile extends UsingBlocExpression{

	List<AbstractExpression> expressionsBloc;
	String condition;
	
	public EWhile(List<AbstractExpression> expressionsBloc, String condition) {
		super();
		this.expressionsBloc = expressionsBloc;
		this.condition = condition;
	}



	public List<ModelObject> generateModelObjects(Context context) {
List<ModelObject> retour = new ArrayList<ModelObject>();
		
		boolean b;
		try {
			b = context.getMathModel().evaluate(condition);
			
			while(b){
				retour.addAll(this.generateBlocs(context, expressionsBloc));
				b = context.getMathModel().evaluate(condition);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return retour;
	}
	
	

}
