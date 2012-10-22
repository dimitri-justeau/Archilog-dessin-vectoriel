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
	
	
	public Color(String name){
		super(name);
	}

}