package model.variables;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:05
 */
public class Point extends Variable {

	/**
	 * La coordonn�e en abscisses du point
	 */
	private int x;
	
	/**
	 * La coordonn�es en ordonn�es du point
	 */
	private int y;

	public Point(String name, int x, int y){
		super(name);
		this.x = x;
		this.y = y;
	}

	/**
	 * @return La coordonn�e en abscisses du point
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return La coordonn�e en ordonn�es du point
	 */
	public int getY() {
		return y;
	}

}