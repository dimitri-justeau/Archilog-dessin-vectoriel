package model.instruction.functions;
import model.Picture;
import model.instruction.Function;
import model.variables.Color;
import model.variables.Shape;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:41
 */
public class FillShape extends Function {

	private Shape shape;
	private Color color;
	
	/**
	 * @param pic
	 * @param path
	 * @param pen
	 * @param color
	 */
	public FillShape(Picture pic, Shape shape, Color color) {
		super(pic);
		this.shape = shape;
		this.color = color;
	}

	public Shape getShape() {
		return shape;
	}

	public Color getColor() {
		return color;
	}
}