package model.variables;

import java.util.List;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:01
 */
public class Path extends Variable {

	/** La liste des points du path */
	protected List<Point> points;
	
	public Path(String name, List<Point> points){
		super(name);
		this.points = points;
	}

	public List<Point> getPoints(){
		return this.points;
	}

}