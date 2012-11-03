package interpretation.expressions.operators;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.*;
import interpretation.Context;
import interpretation.expressions.*;
import model.instruction.operators.*;

public class EFor extends InstructionExpression{

	List<AbstractExpression> expressionsBloc;
	int repeats;
	
	public EFor(int repeats, List<AbstractExpression> exprs){
		this.repeats = repeats;
		this.expressionsBloc = exprs;
	}

	public List<ModelObject> generateModelObject(Context context) {
		
		List<ModelObject> modelObjects = new ArrayList<ModelObject>();
		
		for(AbstractExpression e : this.expressionsBloc){
			// On ajoute les variables et pictures au modele
			if(e instanceof VariableExpression){
				List<ModelObject> vars = e.generateModelObject(context);
				for(ModelObject v : vars){
					if(v instanceof Variable){
						context.getModel().putVariable((Variable) v);
					}
				}
			}
			else
			if(e instanceof EPicture){
				List<ModelObject> pics = e.generateModelObject(context);
				for(ModelObject p : pics){
					if(p instanceof Picture){
						context.getModel().putPicture((Picture) p);
					}
				}
			}
			// On ajoute l'instruction à ajouter au For
			else
			if(e instanceof InstructionExpression){
				modelObjects.addAll(e.generateModelObject(context));
			}
		}
		
		// Les pictures pour lesquelles il faudra créer un For et les
		// For en question
		Map<Picture, For> pics = new HashMap<Picture, For>();
		
		for(ModelObject o : modelObjects){

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
