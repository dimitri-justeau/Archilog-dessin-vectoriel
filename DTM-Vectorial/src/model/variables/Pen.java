package model.variables;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:02
 */
public class Pen extends DrawingTools {

	/**
	 * Le type de ligne a utiliser
	 */
	private String type;


	/**
	 * La couleur du tracé
	 */
	private Color color;

	/**
	 * L'épaisseur du tracé
	 */
	private int stroke;

	/**
	 *
	 * @param name Nom du crayon
	 * @param type Type de crayon à utiliser
	 * @param color Couleur du crayon
	 * @param stroke Épaisseur du crayon 
	 */

	public Pen(String name, String type, Color color, int stroke){
		super(name);
		this.type = type;
		this.color = color;
		this.stroke = stroke;
	}

	/**
	 * Méthode qui retourne le type de stylo à utiliser.
	 * @return  Le type de crayon à utiliser
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Méthode qui retourne la couleur de stylo à utiliser.
	 * @return La couleur du tracé
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Méthode qui retourne l'épaisseur du tracé
	 * @return L'épaisseur du tracé
	 */
	public int getStroke() {
		return stroke;
	}

}
