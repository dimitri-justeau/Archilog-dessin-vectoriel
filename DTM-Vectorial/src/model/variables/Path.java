package model.variables;

import java.util.List;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:01
 */
public class Path extends Variable {

	/**
	 * La liste des points qui conforment le chemin.
	 */
	protected List<Point> points;

	/**
	 * 
	 * @param name Nom du chemin
	 * @param points Liste des points qui conforment le chemin.
	 */
	public Path(String name, List<Point> points){
		super(name);
		this.points = points;
	}

	/**
	 * Méthode qui retourne la liste des points qui conforment
	 * le chemin.
	 * @return La liste des points
	 */
	public List<Point> getPoints(){
		return this.points;
	}

}