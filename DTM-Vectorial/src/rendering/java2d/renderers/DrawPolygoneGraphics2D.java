package rendering.java2d.renderers;

import java.awt.Graphics2D;

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
		// On spécifie la couleur dans un premier temps
		g2d.setColor(this.getDrawPath().getColor().getColorAwt());
		// On dessine le polygone 
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
