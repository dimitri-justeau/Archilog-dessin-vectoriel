package rendering.svg.renderers;

import java.awt.BasicStroke;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;

import model.instruction.functions.DrawPath;
import model.variables.Bezier;

import org.apache.batik.svggen.SVGGraphics2D;

import rendering.java2d.Util;

public class DrawBezierSvg extends DrawPathSVG{
	/**
	 * La courbe de Bezier à tracer sur le modele
	 */
	private Bezier bezier;

	/**
	 * Constructeur classique prenant en parametre le drawing path du modele
	 * @param dp drawing path du modele
	 */
	public DrawBezierSvg(DrawPath dp) {
		super(dp);
		this.setBezier((Bezier) dp.getPath());
	}

	@Override
	public void render(SVGGraphics2D g2d) {
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
	 * Méthode qui retourne la courbe de Bezier.
	 * @return La courbe de Bezier.
	 */
	public Bezier getBezier() {
		return bezier;
	}

	/**
	 * Méthode qui permet de changer la courbe de Bezier associé.
	 * @param bezier La nouvelle courbe à associer.
	 */
	public void setBezier(Bezier bezier) {
		this.bezier = bezier;
	}

}
