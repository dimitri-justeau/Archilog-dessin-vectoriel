package model.variables;

import java.util.ArrayList;


/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:11
 */
public class Square extends Polygon {

	/**
	 * La largeur du carré
	 */
	private double largeur;
	
	/**
	 * @param name Le nom du carré
	 * @param position Le point le plus en haute gauche
	 * @param width La largeur du carré
	 */
	public Square(String name, Point position, double width){
		super(name, null);
		this.largeur = width;
		this.points = new ArrayList<Point>();
		this.points.add(position);
		int large = (int) Math.round(width);
		Point next = new Point(position.getName() + "1",
				position.getX(),
				position.getY() + large);
		this.points.add(next);
		next = new Point(position.getName() + "2",
				position.getX() + large,
				position.getY());
		this.points.add(next);
		next = new Point(position.getName() + "2",
				position.getX(),
				position.getY() - large);
		this.points.add(next);
		this.setPoints(points);
		
	}

	/**
	 * Méthode qui retourne la largeur du carrée.
	 * @return La largeur du carrée.
	 */
	public double getWidth() {
		return largeur;
	}

}