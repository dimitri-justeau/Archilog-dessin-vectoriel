package model.variables;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:01
 */
public class Path extends Variable {

	Point start;
	
	Path rest;

	public Path(String name){
		super(name);
	}

}