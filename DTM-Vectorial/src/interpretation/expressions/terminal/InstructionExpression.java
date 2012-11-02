package interpretation.expressions.terminal;

import model.*;
import interpretation.Context;
import interpretation.expressions.AbstractExpression;

public abstract class InstructionExpression extends AbstractExpression{

	public final void interpret(Context context) {
		for(ModelObject i : this.generateModelObject(context)){
			Instruction inst = (Instruction)i;
			Picture pic = inst.getPicture();
			pic.addInstruction(inst);
		}
	}	
}
