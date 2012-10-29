package model.variables;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:01
 */
public class Path extends Variable {

	/**
	 * Point de d�part du chemin
	 */
	Point start;
	
	/**
	 * Path suivante apr�s le point de d�part
	 */
	Path rest;

	public Path(String name){
		super(name);
	}
	
	/**
	 * M�thode qui retourne le point initiale du chemin
	 * @return
	 */
	public Point getStart() {
		return this.start;
	}

	public Path getRest() {
		return this.rest;
	}

}