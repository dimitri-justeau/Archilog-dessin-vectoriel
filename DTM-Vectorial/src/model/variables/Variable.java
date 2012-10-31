package model.variables;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:13
 */
public abstract class Variable {

	/**
	 * Le nom de la variable
	 */
	private String name;
	
	/**
	 * 
	 * @param name Le nom de la variable
	 */
	public Variable(String name){
		this.name = name;
	}
	
	/**
	 * Méthode qui retourne le nom de la variable.
	 * @return Le nom de la variable
	 */
	public String getName(){
		return this.name;
	}

}