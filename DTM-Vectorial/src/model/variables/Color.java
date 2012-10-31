package model.variables;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:38
 * 
 * La classe qui va permettre de donner une couleur
 * � un autre objet.
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
	
	/**
	 * @param name Nom de la couleur
	 * @param R Compossante rouge de la couleur
	 * @param G Compossante verte de la couleur
	 * @param B Compossante bleue de la couleur
	 */
	public Color(String name, int R, int G, int B){
		super(name);
		this.R = R;
		this.G = G;
		this.B = B;
	}

	/**
	 * Méthode qui retourne la compossante rouge de la couleur
	 * @return la compossante rouge
	 */
	public int getR() {
		return this.R;
	}

	/**
	 * Méthode qui retourne la compossante verte de la couleur
	 * @return la compossante verte 
	 */
	public int getG() {
		return this.G;
	}

	/**
	 * Méthode qui retourne la compossante bleue de la couleur
	 * @return la compossante bleue
	 */
	public int getB() {
		return this.B;
	}
}
