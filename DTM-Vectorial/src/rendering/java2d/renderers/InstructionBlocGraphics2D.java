package rendering.java2d.renderers;

import java.awt.Graphics2D;

import model.instruction.Instruction;
import model.instruction.operators.InstructionBloc;
import rendering.java2d.FactoryGraphics2D;
import rendering.java2d.RendererGraphics2D;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:43
 */
public class InstructionBlocGraphics2D extends RendererGraphics2D {

	/**
	 * L'objet du modele que nous allons 
	 * parcourir
	 */
	private InstructionBloc loopFor;
	
	public InstructionBlocGraphics2D(InstructionBloc f){
		loopFor = f;
	}

	@Override
	public void render(Graphics2D g2d) {
		for(Instruction inst : loopFor.getInstructionBloc())
			FactoryGraphics2D.makeRendererFrom(inst).render(g2d);
	}
	
	
}
