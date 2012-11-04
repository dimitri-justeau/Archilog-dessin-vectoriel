package model.instruction;

import model.ModelObject;
import model.Picture;




/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:53
 */
public abstract class Instruction extends ModelObject{

	/**
	 * La picture sur laquelle s'applique l'instruction
	 */
	private Picture picture;

	public Instruction(Picture pic){
		this.picture = pic;
	}

	/**
	 * @return La picture sur laquelle s'applique l'instruction
	 */
	public Picture getPicture() {
		return picture;
	}

}