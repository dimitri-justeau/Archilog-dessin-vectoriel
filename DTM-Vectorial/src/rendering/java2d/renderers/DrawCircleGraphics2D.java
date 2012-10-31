package rendering.java2d.renderers;

import java.awt.Graphics2D;

import model.instruction.functions.DrawPath;
import model.variables.Circle;

/**
 * Classe permetant le rendering d'un Cercle sur
 * un Graphics2D 
 */
public class DrawCircleGraphics2D extends DrawPathGraphics2D {

	/**
	 * Le cercle a dessiner
	 */
	private Circle circle;
	
	/**
	 * 
	 * @param ins
	 */
	public DrawCircleGraphics2D(DrawPath dp) {
		super(dp);
		this.setCircle((Circle) dp.getPath());
	}

	@Override
	public void render(Graphics2D g2d) {
		// On specifie la couleur dans un premier temps
		g2d.setColor(this.getDrawPath().getColor().getColorAwt());
		//TODO
	}

	/**
	 * @return the circle
	 */
	public Circle getCircle() {
		return circle;
	}

	/**
	 * @param circle the circle to set
	 */
	public void setCircle(Circle circle) {
		this.circle = circle;
	}

}
