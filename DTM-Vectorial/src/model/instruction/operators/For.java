package model.instruction.operators;
import model.Picture;
import model.instruction.Instruction;
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
	 * L'instruction que l'on doit repeter
	 */
	private Instruction toRepeat;

	public For(Picture pic){
		super(pic);
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
	public Instruction getToRepeat() {
		return toRepeat;
	}

	/**
	 * @param toRepeat the toRepeat to set
	 */
	public void setToRepeat(Instruction toRepeat) {
		this.toRepeat = toRepeat;
	}
	
	

}