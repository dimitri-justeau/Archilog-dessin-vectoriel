package rendering.java2d.renderers;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

import rendering.java2d.Util;

import model.instruction.functions.DrawPath;
import model.variables.Polygon;

/**
 * Classe qui va permettre de dessiner un polygone sur
 * un objet Graphics2D
 *
 */
public class DrawPolygoneGraphics2D extends DrawPathGraphics2D{

	/**
	 * Le polygone a tracer sur l'objet Graphics2D
	 */
	private Polygon polygone;

	/**
	 * Constructeru classique prenant en parametre le 
	 * drawing path du modele
	 * @param dp
	 */
	public DrawPolygoneGraphics2D(DrawPath dp) {
		super(dp);
		this.polygone = (Polygon) dp.getPath();
	}

	@Override
	public void render(Graphics2D g2d) {
		// On sp�cifie la couleur dans un premier temps
		g2d.setColor( Util.getColorAwt(this.getDrawPath().getColor()) );
		// On specifie le pinceau avec lequel dessiner
		BasicStroke bs = new BasicStroke(this.getDrawPath().getPen().getSize());
		g2d.setStroke(bs);
		// On dessine le polygone sur le graphics2D
		
		//TODO
	}


	/**
	 * @return the polygone
	 */
	public Polygon getPolygone() {
		return polygone;
	}

	/**
	 * @param polygone the polygone to set
	 */
	public void setPolygone(Polygon polygone) {
		this.polygone = polygone;
	}

}
