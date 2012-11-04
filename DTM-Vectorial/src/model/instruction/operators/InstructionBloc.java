package model.instruction.operators;
import java.util.List;

import model.Picture;
import model.instruction.Instruction;
import model.instruction.Operator;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:50
 */
public class InstructionBloc extends Operator {

	/**
	 * Les instructions que l'on doit repeter
	 */
	private List<Instruction> instructionBloc;
	


	public InstructionBloc(Picture pic, List<Instruction> instructionBloc) {
		super(pic);
		this.instructionBloc = instructionBloc;
	}
	
	/**
	 * @return Le bloc d'instruction à répéter
	 */
	public List<Instruction> getInstructionBloc(){
		return this.instructionBloc;
	}

	/**
	 * Rajoute une instruction au bloc d'instructions à répéter
	 * @param i
	 */
	public void addInstruction(Instruction i){
		this.instructionBloc.add(i);
	}

}