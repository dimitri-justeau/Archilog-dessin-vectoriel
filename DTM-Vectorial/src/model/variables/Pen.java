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
	 * La couleur de trac�
	 */
	private Color color;
	
	/**
	 * L'�paisseur du trac�
	 */
	private int stroke;
	
	/**
	 *  
	 * @param name Nom de la variable Pen
	 */
	
	public Pen(String name, String type, Color color, int stroke){
		super(name);
		this.type = type;
		this.color = color;
		this.stroke = stroke;
	}
	
	/**
	 * M�thode qui retourne le type de stylo � utiliser
	 * @return
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @return La couleur de trac�
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @return L'epaisseur de trac�
	 */
	public int getStroke() {
		return stroke;
	}

}