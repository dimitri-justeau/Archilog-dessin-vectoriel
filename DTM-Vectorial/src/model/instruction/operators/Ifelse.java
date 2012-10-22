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

	private Instruction ifTrue;
	private Instruction ifFalse;
	private boolean isTrue;

	public Ifelse(Picture pic){
		super(pic);
	}

}