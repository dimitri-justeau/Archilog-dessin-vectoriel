package interpretation.expressions.model.operators;

import interpretation.Context;
import interpretation.expressions.AbstractExpression;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;

public class EFor extends UsingBlocExpression{

	List<AbstractExpression> expressionsBloc;
	String start, end, step;
	
	public EFor(String start, String end, String step, List<AbstractExpression> exprs){
		this.start = start;
		this.end = end;
		this.step = step;
		this.expressionsBloc = exprs;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		
		List<ModelObject> retour = new ArrayList<ModelObject>();
		
		int s = 0;
		int en = 0;
		int st = 0;
		
		try {
			s = (int) context.getMathModel().parseExpression(start);
			en = (int) context.getMathModel().parseExpression(end);
			st = (int) context.getMathModel().parseExpression(step);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i=s; i<en; i+=st){
			retour.addAll(this.generateBlocs(context, expressionsBloc));
		}
		return retour;
	}

}
