package model.instruction.functions;
import model.Picture;
import model.instruction.Function;
import model.variables.Color;
import model.variables.Path;
import model.variables.Pen;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:41
 */
public class DrawPath extends Function {

	private Path path;
	private Pen pen;
	private Color color;

	public DrawPath(Picture pic){
		super(pic);
	}

}