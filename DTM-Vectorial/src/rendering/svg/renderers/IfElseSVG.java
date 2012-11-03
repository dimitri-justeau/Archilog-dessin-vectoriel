package rendering.svg.renderers;

import model.instruction.operators.Ifelse;

import org.apache.batik.svggen.SVGGraphics2D;

import rendering.java2d.FactoryGraphics2D;
import rendering.svg.RendererSVG;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:44
 */
public class IfElseSVG extends RendererSVG {

	/**
	 * L'objet IfElse du Modele
	 */
	private Ifelse ifElse;
	
	public IfElseSVG(Ifelse ie){
		this.ifElse = ie;
	}

	@Override
	public void render(SVGGraphics2D g2d) {
		if(ifElse.isTrue())
			FactoryGraphics2D.makeRendererFrom(ifElse.getIfTrue()).render(g2d);
		else
			FactoryGraphics2D.makeRendererFrom(ifElse.getIfFalse()).render(g2d);
		
	}

}