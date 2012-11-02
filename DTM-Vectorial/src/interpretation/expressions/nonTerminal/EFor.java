package interpretation.expressions.nonTerminal;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.*;
import model.instruction.operators.*;

import interpretation.Context;
import interpretation.expressions.AbstractExpression;

public class EFor extends AbstractExpression{

	List<AbstractExpression> expressionsBloc;
	int repeats;
	
	public EFor(int repeats, List<AbstractExpression> exprs){
		this.repeats = repeats;
		this.expressionsBloc = exprs;
	}
	
	@Override
	public void interpret(Context context) {
		
	}

	@Override
	public List<ModelObject> generateModelObject(Context context) {
		
		List<ModelObject> modelObjects = new ArrayList<ModelObject>();
		
		for(AbstractExpression e : this.expressionsBloc){
			modelObjects.addAll(e.generateModelObject(context));
		}
		
		// Les pictures pour lesquelles il faudra créer un For et les
		// For en question
		Map<Picture, For> pics = new HashMap<Picture, For>();
		
		for(ModelObject o : modelObjects){
			// On ajoute les variables et pictures au modele
			if(o instanceof Variable){
				context.getModel().putVariable((Variable) o);
			}
			else
			if(o instanceof Picture){
				context.getModel().putPicture((Picture) o);
			}
				
			if(o instanceof Instruction){
				Picture p = ((Instruction)o).getPicture();
				if(!pics.containsKey(p)){
					For f = new For(p, this.repeats, new ArrayList<Instruction>());
					f.addInstruction((Instruction)o);
					pics.put(p, f);	
				}
				else{
					For f = pics.get(p);
					f.addInstruction((Instruction)o);
				}
			}
		}
		return new ArrayList<ModelObject>(pics.values());
	}

}
