package rendering.svg.renderers;

import model.instruction.functions.DrawPath;
import rendering.svg.RendererSVG;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:44
 */
public abstract class DrawPathSVG extends RendererSVG {

	/**
	 * L'objet DrawPath du modele contenant toutes les informations
	 * sur le trace a effectuer
	 */
	private DrawPath drawPath;
	
	public DrawPathSVG(DrawPath dp){
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