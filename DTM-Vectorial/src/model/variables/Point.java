package model.variables;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:05
 */
public class Point extends Variable {

	/**
	 * La coordonnée en abscisses du point
	 */
	private int x;

	/**
	 * La coordonnée en ordonnées du point
	 */
	private int y;

	/**
	 * 
	 * @param name Le nom du point
	 * @param x La coordonée en abscisses du point
	 * @param y La coordonée en ordonnées du point
	 */
	public Point(String name, int x, int y){
		super(name);
		this.x = x;
		this.y = y;
	}

	/**
	 * Méthode qui retourne le la coordonée en abscisses.
	 * @return La coordonnée en abscisses du point
	 */
	public int getX() {
		return x;
	}

	/**
	 * Méthode qui retourne le la coordonée en ordonnées.
	 * @return La coordonnée en ordonnées du point
	 */
	public int getY() {
		return y;
	}

}