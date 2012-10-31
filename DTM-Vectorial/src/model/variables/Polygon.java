package model.variables;

import java.util.List;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:06
 */
public class Polygon extends Shape {
	
	/**
	 * La liste des points pour le polygone
	 */
	private List<Point> points;
	
	/**
	 * Consturcteur de base
	 * @param name
	 */
	public Polygon(String name){
		super(name);
	}

	/**
	 * @return the points
	 */
	public List<Point> getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}

}