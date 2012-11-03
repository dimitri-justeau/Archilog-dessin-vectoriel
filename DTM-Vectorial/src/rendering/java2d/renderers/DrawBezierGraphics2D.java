package rendering.java2d.renderers;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;

import model.instruction.functions.DrawPath;
import model.variables.Bezier;
import rendering.java2d.Util;

/**
 * Classe permetant le rendering d'une courbe de Bezier sur un Graphics2D
 */
public class DrawBezierGraphics2D extends DrawPathGraphics2D {

	/**
	 * La courbe de Bezier a tracer sur le modele
	 */
	private Bezier bezier;

	/**
	 * Constructeur classique prenant en parametre le drawing path du modele
	 * 
	 * @param dp
	 */
	public DrawBezierGraphics2D(DrawPath dp) {
		super(dp);
		this.setBezier((Bezier) dp.getPath());
	}

	@Override
	public void render(Graphics2D g2d) {
		// On specifie la couleur dans un premier temps
		g2d.setColor(Util.getColorAwt(this.getDrawPath().getColor()));
		// On specifie le pinceau avec lequel dessiner
		BasicStroke bs = new BasicStroke(this.getDrawPath().getPen()
				.getStroke());
		g2d.setStroke(bs);
		// On dessine la courbe de Bezier
		CubicCurve2D curve = new CubicCurve2D.Double();
		Point2D[] lp = new Point2D[this.bezier.getPoints().size()];
		for (int i = 0; i < lp.length; i++)
			lp[i] = new Point2D.Double(bezier.getPoints().get(i).getX(),
					bezier.getPoints().get(i).getY());
		curve.setCurve(lp, 0);
		g2d.draw(curve);
		g2d.draw(curve);
	}

	/**
	 * @return the bezier
	 */
	public Bezier getBezier() {
		return bezier;
	}

	/**
	 * @param bezier
	 *            the bezier to set
	 */
	public void setBezier(Bezier bezier) {
		this.bezier = bezier;
	}

}
