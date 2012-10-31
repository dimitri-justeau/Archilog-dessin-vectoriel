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

	
	
	/**
	 * @param pic
	 * @param path
	 * @param pen
	 * @param color
	 */
	public DrawPath(Picture pic, Path path, Pen pen, Color color) {
		super(pic);
		this.path = path;
		this.pen = pen;
		this.color = color;
	}

	public DrawPath(Picture pic){
		super(pic);
	}

	public Path getPath() {
		return path;
	}

	public void setPath(Path path) {
		this.path = path;
	}

	public Pen getPen() {
		return pen;
	}

	public void setPen(Pen pen) {
		this.pen = pen;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}