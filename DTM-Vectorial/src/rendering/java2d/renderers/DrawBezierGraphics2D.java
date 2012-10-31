package rendering.java2d.renderers;

import java.awt.Graphics2D;

import model.instruction.functions.DrawPath;
import model.variables.Bezier;

/**
 * Classe permetant le rendering d'une courbe de 
 * Bezier sur un Graphics2D
 */
public class DrawBezierGraphics2D extends DrawPathGraphics2D {

	/**
	 * La courbe de Bezier a tracer sur le modele
	 */
	private Bezier bezier;
	
	/**
	 * Constructeur classique prenant en parametre
	 * le drawing path du modele
	 * @param dp
	 */
	public DrawBezierGraphics2D(DrawPath dp) {
		super(dp);
		this.setBezier((Bezier) dp.getPath());
	}

	@Override
	public void render(Graphics2D g2d) {
		// On specifie la couleur dans un premier temps
		g2d.setColor(this.getDrawPath().getColor().getColorAwt());
		//TODO
	}

	/**
	 * @return the bezier
	 */
	public Bezier getBezier() {
		return bezier;
	}

	/**
	 * @param bezier the bezier to set
	 */
	public void setBezier(Bezier bezier) {
		this.bezier = bezier;
	}

}
