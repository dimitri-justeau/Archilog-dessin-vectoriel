package model.instruction.functions;


import model.Picture;
import model.instruction.Function;
import model.variables.Color;
import model.variables.Point;

public class DrawLabel extends Function {
	
	private Point position;
	private Color color;
	private int size;
	private String text;

	public DrawLabel(Picture pic, Point pos, Color couleur, int size,
			String text) {
		super(pic);
		this.position = pos;
		this.color = couleur;
		this.size = size;
		this.text = text;
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
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	

}
