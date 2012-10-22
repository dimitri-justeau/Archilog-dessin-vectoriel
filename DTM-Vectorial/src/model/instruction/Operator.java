package model.instruction;

import model.Picture;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:58
 */
public abstract class Operator extends Instruction {

	public Operator(Picture pic){
		super(pic);
	}

}