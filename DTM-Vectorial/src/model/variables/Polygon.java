package model.variables;

import java.util.List;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:06
 */
public class Polygon extends Shape {

	/**
	 * @param name Le nom du polygone
	 * @param points La liste de points qui conforment le polygone
	 */
	public Polygon(String name, List<Point> points){
		super(name, points);
	}

	/**
	 * Méthode qui permet de changer la liste des points
	 * du polygone.
	 * @param points the points to set
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}

}