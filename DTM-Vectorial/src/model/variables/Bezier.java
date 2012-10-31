package model.variables;

import java.util.List;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:35
 * 
 * La classe qui va permettre la modelisation d'une 
 * courbe de Bezier
 */
public class Bezier extends Path {

	/** La liste des points de la courbe de Bezier */
	private List<Point> points;
	
	public Bezier(String name){
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