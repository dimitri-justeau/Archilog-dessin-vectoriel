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
	String name;
	
	public Variable(String name){
		this.name = name;
	}
	
	/**
	 * @return Le nom de la variable
	 */
	public String getName(){
		return this.name;
	}

}