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
	
	/** La taille du pen */
	private float size;
	
	/**
	 *  
	 * @param name Nom de la variable Pen
	 */
	
	public Pen(String name){
		super(name);
	}
	/**
	 * Méthode qui retourne le type de stylo à utiliser
	 * @return
	 */
	public String getType() {
		return this.type;
	}
	/**
	 * @return the size
	 */
	public float getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(float size) {
		this.size = size;
	}

}