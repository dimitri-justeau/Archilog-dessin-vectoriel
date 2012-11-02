package model.instruction.operators;
import java.util.ArrayList;
import java.util.List;

import model.Instruction;
import model.Picture;
import model.instruction.Operator;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:50
 */
public class For extends Operator {

	/**
	 * Nombre de fois que l'on doit repeter l'occurance
	 */
	private int repeats;
	
	/**
	 * Les instructions que l'on doit repeter
	 */
	private List<Instruction> instructionBloc;
	
	/**
	 * @param pic
	 * @param repeats
	 * @param toRepeat
	 */
	@Deprecated
	public For(Picture pic, int repeats, Instruction toRepeat) {
		super(pic);
		this.repeats = repeats;
		this.instructionBloc = new ArrayList<Instruction>();
		this.instructionBloc.add(toRepeat);
	}
	

	public For(Picture pic, int repeats, List<Instruction> instructionBloc) {
		super(pic);
		this.repeats = repeats;
		this.instructionBloc = instructionBloc;
	}



	/**
	 * @return the repeats
	 */
	public int getRepeats() {
		return repeats;
	}

	/**
	 * @param repeats the repeats to set
	 */
	public void setRepeats(int repeats) {
		this.repeats = repeats;
	}

	/**
	 * @return the toRepeat
	 */
	@Deprecated
	public Instruction getToRepeat() {
		return instructionBloc.get(0);
	}

	/**
	 * @param toRepeat the toRepeat to set
	 */
	@Deprecated
	public void setToRepeat(Instruction toRepeat) {
		this.instructionBloc.add(0, toRepeat);
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