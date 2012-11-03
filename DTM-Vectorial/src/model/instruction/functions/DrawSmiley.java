package model.instruction.functions;
import java.util.ArrayList;
import java.util.List;

import model.Instruction;
import model.Picture;
import model.instruction.Function;
import model.variables.Bezier;
import model.variables.Circle;
import model.variables.Color;
import model.variables.Pen;
import model.variables.Point;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:45
 */
public class DrawSmiley extends Function {

	/**
	 * La couleur du smiley
	 */
	private Color color;
	
	/**
	 * La taille du smiley
	 */
	private int size;
	
	/**
	 * La position du smiley
	 */
	private Point position;


	
	/**
	 * @param pic
	 * @param color
	 * @param size
	 * @param position
	 */
	public DrawSmiley(Picture pic, Color color, int size, Point position) {
		super(pic);
		this.color = color;
		this.size = size;
		this.position = position;
	}
	
	public List<Instruction> getInstructions(){
		List<Instruction> instructions = new ArrayList<Instruction>();
		double x = this.getPosition().getX(), y = this.getPosition().getY();
		double size = this.getSize();
		
		Pen pen = new Pen("the pen", null, (int)((getSize()+0.0)/50.0));
		Pen penEyes = new Pen("the pen", null, 20);//(int)((getSize()+0.0)/10.0));
		
		// the basic circle
		Circle c1 = new Circle("smiley_face", new Point("center_smiley_face",
				(int) (x),
				(int) (y-size)),
				size);
		DrawPath draw_c1 = new DrawPath(getPicture(), c1, pen, getColor());
		instructions.add(draw_c1);
		// Left eye
		Circle c2 = new Circle("left_eye", new Point("center_left_eye", 
				(int)(x+size/4.0),
				(int)(y -3.0*size/5.0)),
				1);
		DrawPath draw_c2 = new DrawPath(getPicture(), c2, penEyes, getColor());
		instructions.add(draw_c2);
		// Right eye
		Circle c3 = new Circle("right_eye", new Point("center_right_eye", 
				(int)(x + 3.0*size/4.0),
				(int)(y -3.0*size/5.0)),
				1);
		DrawPath draw_c3 = new DrawPath(getPicture(), c3, penEyes, getColor());
		instructions.add(draw_c3);
		// The smile
		Point p1 = new Point("smiley_smile_1",
				(int) (x + size/4.0 ),
				(int) (y - 2.0*size/6.0));
		Point p2 = new Point("smiley_smile_2",
				(int) (x + size/2.0-1),
				(int) (y - 1.0*size/5.0));
		Point p3 = new Point("smiley_smile_3",
				(int) (x + size/2.0+1),
				(int) (y - 1.0*size/5.0));
		Point p4 = new Point("smiley_smile_4",
				(int) (x + 3.0*size/4.0),
				(int) (y - 2.0*size/6.0));
		List<Point> points = new ArrayList<Point>();
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		Bezier bezier = new Bezier("smile", points);
		DrawPath draw_bezier = new DrawPath(getPicture(), bezier, pen, getColor());
		instructions.add(draw_bezier);
		return instructions;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the position
	 */
	public Point getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(Point position) {
		this.position = position;
	}

	
}