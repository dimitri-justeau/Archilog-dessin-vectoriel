package rendering.java2d.renderers;

import java.awt.Graphics2D;

import model.Instruction;
import model.instruction.functions.DrawSmiley;
import rendering.java2d.FactoryGraphics2D;
import rendering.java2d.RendererGraphics2D;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:46
 */
public class DrawSmileyGraphics2D extends RendererGraphics2D {

	/** Le smiley a tracer sur l'objet Graphics2D */
	private DrawSmiley ds;
	
	public DrawSmileyGraphics2D(Instruction ins) {
		ds = (DrawSmiley) ins;
	}

	@Override
	public void render(Graphics2D g2d) {
		for(Instruction i : this.ds.getInstructions())
			FactoryGraphics2D.makeRendererFrom(i).render(g2d);
	}

}