package model.variables;

import java.util.ArrayList;


/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:11
 */
public class Square extends Polygon {

	private double width;
	
	/**
	 * @param name
	 * @param position Le point le plus en haut à gauche
	 */
	public Square(String name, Point position, double width){
		super(name, null);
		this.width = width;
		this.points = new ArrayList<Point>();
		this.points.add(position);
		// TODO : Generer les 3 autres points du carré, dans un ordre cyclique
	}

	public double getWidth() {
		return width;
	}

}