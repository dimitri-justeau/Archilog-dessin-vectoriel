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

	private int repeats;
	private Instruction toRepeat;

	public For(Picture pic){
		super(pic);
	}

}