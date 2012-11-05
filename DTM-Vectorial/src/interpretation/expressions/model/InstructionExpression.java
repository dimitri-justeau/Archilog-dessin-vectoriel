package interpretation.expressions.model;



import model.*;
import model.instruction.Instruction;
import interpretation.Context;

public abstract class InstructionExpression extends ModelExpression{

	public final void interpret(Context context) {
		for(ModelObject i : this.generateModelObjects(context)){
			Instruction inst = (Instruction)i;
			Picture pic = inst.getPicture();
			pic.addInstruction(inst);
		}
	}
}
