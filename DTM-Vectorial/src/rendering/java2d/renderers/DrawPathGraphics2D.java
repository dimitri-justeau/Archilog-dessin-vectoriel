package rendering.java2d.renderers;

import model.instruction.functions.DrawPath;
import rendering.java2d.RendererGraphics2D;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:43
 * 
 * Classe qui va permettre d'effectuer le rendering de la methode
 * drawPath du modele
 * L'objet drawPath du modele est recupere directement en parametre du
 * constructeur
 */
public abstract class DrawPathGraphics2D extends RendererGraphics2D {

	/**
	 * L'objet DrawPath du modele contenant toutes les informations
	 * sur le trace a effectuer
	 */
	private DrawPath drawPath;
	
	public DrawPathGraphics2D(DrawPath dp){
		super();
		this.setDrawPath(dp);
	}

	public DrawPath getDrawPath() {
		return drawPath;
	}

	public void setDrawPath(DrawPath drawPath) {
		this.drawPath = drawPath;
	}

}