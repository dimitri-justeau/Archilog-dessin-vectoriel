package model.instruction.functions;

import java.util.ArrayList;
import java.util.List;

import model.Picture;
import model.instruction.Function;
import model.instruction.Instruction;
import model.variables.Color;
import model.variables.Point;
import model.variables.Polygon;

public class DrawEmn extends Function {
	/**
	* La position en haut gauche du texte
	*/
	private Point position;
	
	/**
	* Largeur
	*/
	private int largeur;
	
	/**
	* Hauteur
	*/
	private int hauteur;
	
	/**
	* Couleur
	*/
	private Color couleur;
	/**
	 * @param pic
	 * @param color
	 * @param position
	 * @param largeur
	 * @param hauteur
	 */
	public DrawEmn(Picture pic, Color color, Point position, int largeur, int hauteur) {
		super(pic);
		this.couleur = color;
		this.position = position;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	public List<Instruction> getInstructions(){
		List<Instruction> instructions = new ArrayList<Instruction>();
		List<Point> ajouter = new ArrayList<Point>();
		int division = (int) (getLargeur()/2);
		int gros = (int) (getHauteur()/5);
		ajouter.add(position);
		Point next = new Point("E11",(int)(getPosition().getX()),
				(int) (getPosition().getY()+(gros)));
		ajouter.add(next);
		next = new Point("E12",(int)(getPosition().getX()+(division*80/100)),
				(int) (next.getY()));
		ajouter.add(next);
		next = new Point("E13",(int)(getPosition().getX()+division),
				(int) (getPosition().getY()));
		ajouter.add(next);
		Polygon E1 = new Polygon("E1",ajouter);
		FillShape drawM = new FillShape(getPicture(),E1, this.couleur);
		instructions.add(drawM);
		ajouter = new ArrayList<Point>();
		next = new Point("E21",(int)(getPosition().getX()), 
				(int)(getPosition().getY()+gros*2));
		ajouter.add(next);
		next = new Point("E22",(int)(getPosition().getX()), 
				(int)(next.getY()+gros));
		ajouter.add(next);
		next = new Point("E23",(int)(next.getX()+(division*60/100)), 
				(int)(next.getY()));
		ajouter.add(next);
		
		next = new Point("E24",(int)(next.getX()-(division*20/100)), 
				(int)(next.getY()-gros*0.5));
		ajouter.add(next);
		
		next = new Point("E24",(int)(next.getX()+(division*20/100)), 
				(int)(next.getY()-gros*0.5));
		ajouter.add(next);
		Polygon E2 = new Polygon("E2",ajouter);
		FillShape drawM2 = new FillShape(getPicture(),E2, this.couleur);
		instructions.add(drawM2);
		
		ajouter = new ArrayList<Point>();
		next = new Point("E31",(int)(getPosition().getX()), 
				(int)(getPosition().getY()+gros*4));
		ajouter.add(next);
		next = new Point("E32",(int)(next.getX()), 
				(int)(next.getY()+gros));
		ajouter.add(next);
		next = new Point("E33",(int)(next.getX()+division), 
				(int)(next.getY()));
		ajouter.add(next);
		next = new Point("E34",(int)(next.getX()-division*20/100), 
				(int)(next.getY()-gros));
		ajouter.add(next);
		Polygon E3 = new Polygon("E3",ajouter);
		FillShape drawM3 = new FillShape(getPicture(),E3, this.couleur);
		instructions.add(drawM3);
		
		ajouter = new ArrayList<Point>();
		next = new Point("M11",(int)(getPosition().getX()+division+3), 
				(int)(getPosition().getY()));
		ajouter.add(next);
		next = new Point("M12",(int)(next.getX()), 
				(int)(next.getY()+getHauteur()));
		ajouter.add(next);
		next = new Point("M13",(int)(next.getX()+gros), 
				(int)(next.getY()));
		ajouter.add(next);
		next = new Point("M14",(int)(next.getX()), 
				(int)(next.getY()-getHauteur()*80/100));
		ajouter.add(next);
		Polygon E4 = new Polygon("M4",ajouter);
		FillShape drawM4 = new FillShape(getPicture(),E4, this.couleur);
		instructions.add(drawM4);
		
		ajouter = new ArrayList<Point>();
		next = new Point("M21",(int)(getPosition().getX()+(division+3)+(gros*2)), 
				(int)(getPosition().getY()+getHauteur()*40/100));
		ajouter.add(next);
		next = new Point("M22",(int)(next.getX()), 
				(int)(getPosition().getY()+getHauteur()));
		ajouter.add(next);
		next = new Point("M23",(int)(next.getX()+gros), 
				(int)(next.getY()));
		ajouter.add(next);
		next = new Point("M24",(int)(next.getX()), 
				(int)(next.getY()-getHauteur()*60/100));
		ajouter.add(next);
		next = new Point("M25",(int)(next.getX()-gros*0.5), 
				(int)(next.getY()+getHauteur()*20/100));
		ajouter.add(next);
		Polygon E5 = new Polygon("E5",ajouter);
		FillShape drawM5 = new FillShape(getPicture(),E5, this.couleur);
		instructions.add(drawM5);
		
		ajouter = new ArrayList<Point>();
		next = new Point("M31",(int)(getPosition().getX()+(division+3)+(gros*4)), 
				(int)(getPosition().getY()+getHauteur()*20/100));
		ajouter.add(next);
		next = new Point("M32",(int)(next.getX()), 
				(int)(getPosition().getY()+getHauteur()));
		ajouter.add(next);
		next = new Point("M33",(int)(next.getX()+gros), 
				(int)(next.getY()));
		ajouter.add(next);
		next = new Point("M34",(int)(next.getX()), 
				(int)(next.getY()-getHauteur()));
		ajouter.add(next);
		Polygon E6 = new Polygon("E6",ajouter);
		FillShape drawM6 = new FillShape(getPicture(),E6, this.couleur);
		instructions.add(drawM6);
		return instructions;
	}
	
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public Color getCouleur() {
		return couleur;
	}
	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
}