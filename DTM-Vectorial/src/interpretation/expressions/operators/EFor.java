package interpretation.expressions.operators;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.*;
import interpretation.Context;
import interpretation.expressions.*;
import model.instruction.operators.*;
import model.variables.Variable;

public class EFor extends InstructionExpression{

	List<AbstractExpression> expressionsBloc;
	int repeats;
	
	public EFor(int repeats, List<AbstractExpression> exprs){
		this.repeats = repeats;
		this.expressionsBloc = exprs;
	}

	public List<ModelObject> generateModelObject(Context context) {
		
		List<ModelObject> modelObjects = new ArrayList<ModelObject>();
		List<ModelObject> retour = new ArrayList<ModelObject>();
		
		for(int i=0; i<repeats; i++){
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
			Map<Picture, InstructionBloc> pics = new HashMap<Picture, InstructionBloc>();
			
			for(ModelObject o : modelObjects){
	
				if(o instanceof Instruction){
					Picture p = ((Instruction)o).getPicture();
					if(!pics.containsKey(p)){
						InstructionBloc f = new InstructionBloc(p, new ArrayList<Instruction>());
						f.addInstruction((Instruction)o);
						pics.put(p, f);	
					}
					else{
						InstructionBloc f = pics.get(p);
						f.addInstruction((Instruction)o);
					}
				}
			}
			retour.addAll(new ArrayList<ModelObject>(pics.values()));
		}
		return retour;
	}

}
