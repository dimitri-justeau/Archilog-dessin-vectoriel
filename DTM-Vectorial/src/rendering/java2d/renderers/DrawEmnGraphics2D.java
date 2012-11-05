package rendering.java2d.renderers;

import java.awt.Graphics2D;

import rendering.java2d.FactoryGraphics2D;
import rendering.java2d.RendererGraphics2D;
import model.instruction.Instruction;
import model.instruction.functions.DrawEmn;

public class DrawEmnGraphics2D extends RendererGraphics2D{
	/**
	* Le logo de l'Emn
	*/
	private DrawEmn de;
	
	public DrawEmnGraphics2D(Instruction ins) {
		this.de = (DrawEmn) ins;
	}

	public void render(Graphics2D g2d) {
		for(Instruction ins: this.de.getInstructions()) {
			FactoryGraphics2D.makeRendererFrom(ins).render(g2d);
		}
	}
	
}
