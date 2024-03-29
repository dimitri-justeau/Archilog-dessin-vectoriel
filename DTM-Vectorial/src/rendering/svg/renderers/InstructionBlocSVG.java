package rendering.svg.renderers;

import model.instruction.Instruction;
import model.instruction.operators.InstructionBloc;

import org.apache.batik.svggen.SVGGraphics2D;

import rendering.svg.FactorySVG;
import rendering.svg.RendererSVG;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:44
 */
public class InstructionBlocSVG extends RendererSVG {

	/**
	 * L'objet du modele que nous allons 
	 * parcourir
	 */
	private InstructionBloc loopFor;
	
	/**
	 * 
	 * @param f
	 */
	public InstructionBlocSVG(InstructionBloc f){
		loopFor = f;
	}

	@Override
	public void render(SVGGraphics2D g2d) {
		for(Instruction inst : loopFor.getInstructionBloc())
			FactorySVG.makeRendererFrom(inst).render(g2d);
	}



}