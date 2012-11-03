package rendering.svg.renderers;

import java.awt.Graphics2D;

import org.apache.batik.svggen.SVGGraphics2D;

import model.instruction.operators.For;

import rendering.svg.FactorySVG;
import rendering.svg.RendererSVG;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:44
 */
public class ForSVG extends RendererSVG {

	/**
	 * L'objet du modele que nous allons 
	 * parcourir
	 */
	private For loopFor;
	
	public ForSVG(For f){
		loopFor = f;
	}

	@Override
	public void render(SVGGraphics2D g2d) {
		// TODO Auto-generated method stub
		RendererSVG r = FactorySVG.makeRendererFrom(loopFor.getToRepeat());
		for (int i = 0; i < loopFor.getRepeats(); i++) {
			r.render(g2d);
		}
		
	}



}