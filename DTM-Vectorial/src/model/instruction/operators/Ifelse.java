package model.instruction.operators;
import model.Picture;
import model.instruction.Instruction;
import model.instruction.Operator;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:51
 */
public class Ifelse extends Operator {

	/**
	 * l'instruction a faire si la condition est vraie
	 */
	private Instruction ifTrue;
	
	/**
	 * l'instruction a faire sir la condition est
	 * fausse
	 */
	private Instruction ifFalse;
	
	/**
	 * La condition
	 */
	private boolean isTrue;

	
	/**
	 * @param pic
	 * @param ifTrue
	 * @param ifFalse
	 * @param isTrue
	 */
	public Ifelse(Picture pic, Instruction ifTrue,
			Instruction ifFalse,
			boolean isTrue) {
		super(pic);
		this.ifTrue = ifTrue;
		this.ifFalse = ifFalse;
		this.isTrue = isTrue;
	}

	/**
	 * @return the ifTrue
	 */
	public Instruction getIfTrue() {
		return ifTrue;
	}

	/**
	 * @param ifTrue the ifTrue to set
	 */
	public void setIfTrue(Instruction ifTrue) {
		this.ifTrue = ifTrue;
	}

	/**
	 * @return the ifFalse
	 */
	public Instruction getIfFalse() {
		return ifFalse;
	}

	/**
	 * @param ifFalse the ifFalse to set
	 */
	public void setIfFalse(Instruction ifFalse) {
		this.ifFalse = ifFalse;
	}

	/**
	 * @return the isTrue
	 */
	public boolean isTrue() {
		return isTrue;
	}

	/**
	 * @param isTrue the isTrue to set
	 */
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	
	

}