package rendering.svg.renderers;

import model.instruction.Instruction;
import model.instruction.functions.DrawSmiley;

import org.apache.batik.svggen.SVGGraphics2D;

import rendering.svg.FactorySVG;
import rendering.svg.RendererSVG;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:47
 */
public class DrawSmileySVG extends RendererSVG {

	/** the draw smiley of the modele */
	private DrawSmiley ds;

	public DrawSmileySVG(Instruction ins) {
		this.ds =(DrawSmiley) ins;
	}

	@Override
	public void render(SVGGraphics2D g2d) {
		for(Instruction ins: this.ds.getInstructions())
			FactorySVG.makeRendererFrom(ins).render(g2d);
		
	}

}