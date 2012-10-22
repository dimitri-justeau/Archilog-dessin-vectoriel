package model.instruction.functions;
import model.Picture;
import model.instruction.Function;
import model.variables.Color;
import model.variables.Point;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:45
 */
public class DrawSmiley extends Function {

	private Color color;
	private int size;
	private Point position;

	public DrawSmiley(Picture pic){
		super(pic);
	}

}