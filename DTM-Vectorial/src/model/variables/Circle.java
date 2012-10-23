package model.variables;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:37
 */
public class Circle extends Shape {

	/**
	 * Position du centre du cercle
	 */
	private Point position;
	
	/**
	 * Rayon du cercle
	 */
	private double rayon;
	
	/**
	 * Contructeur de l'objet cercle
	 * @param name
	 * @param position
	 * @param rayon
	 */
	public Circle(String name, Point position, double rayon){
		super(name);
		this.position = position;
		this.rayon = rayon;
	}

	public Point getPosition() {
		return this.position;
	}

	public double getRayon() {
		return this.rayon;
	}

}