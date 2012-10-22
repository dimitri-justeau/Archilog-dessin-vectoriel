package model;

import java.util.List;

import model.instruction.Instruction;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:04
 */
public class Picture {

	/**
	 * Les instructions appliquées sur la picture
	 */
	private List<Instruction> instructions;
	
	/**
	 * Le nom de la picture
	 */
	private String name;

	public Picture(String name){
		this.name = name;
	}

	/**
	 * @return Le nom de la picture
	 */
	public String getName(){
		return this.name;
	}

	/**
	 * @return Les instructions appliquées sur la picture
	 */
	public List<Instruction> getInstructions() {
		return instructions;
	}

}