package interpretation.expressions.model.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.ModelObject;
import model.Picture;
import model.instruction.Instruction;
import model.instruction.operators.InstructionBloc;
import model.variables.Variable;
import interpretation.Context;
import interpretation.expressions.AbstractExpression;
import interpretation.expressions.math.MathExpression;
import interpretation.expressions.model.EPicture;
import interpretation.expressions.model.InstructionExpression;
import interpretation.expressions.model.ModelExpression;
import interpretation.expressions.model.VariableExpression;

public abstract class UsingBlocExpression extends InstructionExpression{
	
	public List<ModelObject> generateBlocs(Context context,
			List<AbstractExpression> expressionsBloc){
		
		List<ModelObject> modelObjects = new ArrayList<ModelObject>();
		List<ModelObject> retour = new ArrayList<ModelObject>();
		
		for(AbstractExpression e : expressionsBloc){
			
			// On réalise les opérations mathématiques
			if(e instanceof MathExpression){
				e.interpret(context);
			}
			
			if(e instanceof ModelExpression){
				ModelExpression me = (ModelExpression) e;
				// On ajoute les variables et pictures au modele
				if(e instanceof VariableExpression){
					List<ModelObject> vars = me.generateModelObjects(context);
					for(ModelObject v : vars){
						if(v instanceof Variable){
							context.getModel().putVariable((Variable) v);
						}
					}
				}
				else
				if(e instanceof EPicture){
					List<ModelObject> pics = me.generateModelObjects(context);
					for(ModelObject p : pics){
						if(p instanceof Picture){
							context.getModel().putPicture((Picture) p);
						}
					}
				}
				// On ajoute l'instruction à ajouter au For
				else
				if(e instanceof InstructionExpression){
					modelObjects.addAll(me.generateModelObjects(context));
				}
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
		return retour;
	}

}
