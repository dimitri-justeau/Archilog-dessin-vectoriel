package rendering.svg.renderers;

import java.awt.BasicStroke;

import model.instruction.functions.DrawPath;
import model.variables.Point;
import model.variables.Polygon;

import org.apache.batik.svggen.SVGGraphics2D;

import rendering.java2d.Util;

public class DrawPolygoneSvg extends DrawPathSVG{
	
	/**
	 * Le polygone à tracer sur le modele.
	 */
	private Polygon polygone;

	/**
	 * Constructeru classique prenant en parametre le 
	 * drawing path du modele
	 * @param dp drawing path du modele
	 */
	public DrawPolygoneSvg(DrawPath dp) {
		super(dp);
		this.polygone = (Polygon) dp.getPath();
	}

	@Override
	public void render(SVGGraphics2D g2d) {
		// On sp�cifie la couleur dans un premier temps
		g2d.setColor( Util.getColorAwt(this.getDrawPath().getColor()) );
		// On specifie le pinceau avec lequel dessiner
		BasicStroke bs = new BasicStroke(this.getDrawPath().getPen().getStroke());
		g2d.setStroke(bs);
		// On dessine le polygone sur le graphics2D
		for (int i = 0; i < polygone.getPoints().size(); i++) {
			Point p1,p2;
			p1 = polygone.getPoints().get(i);
			if (i == polygone.getPoints().size() - 1)
				p2 = polygone.getPoints().get(0);
			else
				p2 = polygone.getPoints().get(i+1);
			g2d.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		}
	}


	/**
	 * Méthode qui retourne le polygone associé.
	 * @return the polygone
	 */
	public Polygon getPolygone() {
		return polygone;
	}

	/**
	 * Méthode qui permet de changer le polygone associé.
	 * @param polygone the polygone to set
	 */
	public void setPolygone(Polygon polygone) {
		this.polygone = polygone;
	}
}
