package rendering.svg.renderers;

import model.Instruction;
import model.instruction.operators.For;

import org.apache.batik.svggen.SVGGraphics2D;

import rendering.java2d.FactoryGraphics2D;
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
		for(Instruction inst : loopFor.getInstructionBloc())
			FactoryGraphics2D.makeRendererFrom(inst).render(g2d);
	}



}