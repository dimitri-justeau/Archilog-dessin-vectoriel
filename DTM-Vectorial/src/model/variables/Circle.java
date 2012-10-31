package model.variables;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:37
 * 
 * La classe qui va permettre la modelisation d'un cercle.
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
	 * @param name Nom du cercle.
	 * @param position Point du centre du cercle.
	 * @param rayon Le rayon du cercle.
	 */
	public Circle(String name, Point position, double rayon){
		super(name, null);
		this.position = position;
		this.rayon = rayon;
	}

	/**
	 * Méthode qui retourne le point du centre du cercle.
	 * @return Le poin central du cercle.
	 */
	public Point getPosition() {
		return this.position;
	}
	/**
	 * Méthode qui retourne le rayon du cercle.
	 * @return Le rayon du cercle.
	 */
	public double getRayon() {
		return this.rayon;
	}

}