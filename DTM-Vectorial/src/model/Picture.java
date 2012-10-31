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

	/**
	 * Les dimensions de la picture
	 */
	private double width, height;
	
	public Picture(String name, double width, double height){
		this.width = width;
		this.height = height;
		this.name = name;
	}

	/**
	 * @return Le nom de la picture
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * @return La largeur de la picture (pixels)
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @return La hauteur de la picture (pixels)
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @return Les instructions appliquées sur la picture
	 */
	public List<Instruction> getInstructions() {
		return instructions;
	}

	/**
	 * Ajoute une instruction à la picture
	 * @param instruction
	 */
	public void addInstruction(Instruction instruction){
		this.instructions.add(instruction);
	}
}