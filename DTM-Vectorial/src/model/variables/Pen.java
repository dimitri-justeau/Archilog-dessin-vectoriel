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
	 *  
	 * @param name Nom de la variable Pen
	 */
	
	public Pen(String name){
		super(name);
	}
	/**
	 * M�thode qui retourne le type de stylo � utiliser
	 * @return
	 */
	public String getType() {
		return this.type;
	}

}