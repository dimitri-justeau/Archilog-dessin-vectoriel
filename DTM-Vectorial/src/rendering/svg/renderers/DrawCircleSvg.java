package rendering.svg.renderers;

import java.awt.BasicStroke;
import java.awt.geom.Ellipse2D;

import model.instruction.functions.DrawPath;
import model.variables.Circle;

import org.apache.batik.svggen.SVGGraphics2D;

import rendering.java2d.Util;

public class DrawCircleSvg extends DrawPathSVG{
	
	/**
	 * Le cercle à tracer sur le modele
	 */
	private Circle circle;

	/**
	 *  Constructeur classique prenant en parametre le drawing path du modele.
	 * @param dp drawing path du modele
	 */
	public DrawCircleSvg(DrawPath dp) {
		super(dp);
		this.setCircle((Circle) dp.getPath());
	}

	@Override
	public void render(SVGGraphics2D g2d) {
		// On specifie la couleur dans un premier temps
		g2d.setColor(Util.getColorAwt(this.getDrawPath().getColor()));
		// On specifie le pinceau avec lequel dessiner
		BasicStroke bs = new BasicStroke(this.getDrawPath().getPen()
				.getStroke());
		g2d.setStroke(bs);
		// On dessine le cercle sur le graphics 2D
		Ellipse2D.Double hole = new Ellipse2D.Double();
		hole.width = circle.getRayon();
		hole.height = circle.getRayon();
		hole.x = circle.getPosition().getX();
		hole.y = circle.getPosition().getY();
		g2d.draw(hole);
	}

	/**
	 * Méthode qui retourne le circle à dessiner.
	 * @return the circle
	 */
	public Circle getCircle() {
		return circle;
	}

	/**
	 * Méthode qui permet de changer le cercle associé.
	 * @param circle le cercle à associer.
	 */
	public void setCircle(Circle circle) {
		this.circle = circle;
	}


}
