package rendering.svg;

import java.awt.Graphics2D;

import rendering.IInstructionRenderer;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:08
 */
public abstract class RendererSVG implements IInstructionRenderer {

	public void render(Object o){
		Graphics2D g2D = (Graphics2D) o;
		render(g2D);
	}
	
	public abstract void render(Graphics2D g2D);

}