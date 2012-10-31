package model.variables;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:38
 */
public class Color extends DrawingTools {

	/**
	 * La compossante rouge de la couleur, entre 0 et 255.
	 */
	private int R;
	
	/**
	 * La compossante verte de la couleur, entre 0 et 255.
	 */
	private int G;
	
	/**
	 * La compossante bleue de la couleur, entre 0 et 255.
	 */
	private int B;
	
	
	public Color(String name, int R, int G, int B){
		super(name);
		this.R = R;
		this.G = G;
		this.B = B;
	}

	/**
	 * Méthode qui retourne la compossante rouge de la couleur
	 * @return 
	 */
	public int getR() {
		return this.R;
	}

	/**
	 * Méthode qui retourne la compossante verte de la couleur
	 * @return 
	 */
	public int getG() {
		return this.G;
	}

	/**
	 * Méthode qui retourne la compossante bleue de la couleur
	 * @return 
	 */
	public int getB() {
		return this.B;
	}
}
