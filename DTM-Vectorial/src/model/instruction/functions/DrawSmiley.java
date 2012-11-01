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

	/**
	 * La couleur du smiley
	 */
	private Color color;
	
	/**
	 * La taille du smiley
	 */
	private int size;
	
	/**
	 * La position du smiley
	 */
	private Point position;


	
	/**
	 * @param pic
	 * @param color
	 * @param size
	 * @param position
	 */
	public DrawSmiley(Picture pic, Color color, int size, Point position) {
		super(pic);
		this.color = color;
		this.size = size;
		this.position = position;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the position
	 */
	public Point getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Point position) {
		this.position = position;
	}

	
}