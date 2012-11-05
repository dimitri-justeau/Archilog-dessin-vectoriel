package rendering.svg.renderers;

import org.apache.batik.svggen.SVGGraphics2D;

import rendering.svg.FactorySVG;
import rendering.svg.RendererSVG;

import model.instruction.Instruction;
import model.instruction.functions.DrawEmn;

public class DrawEmnSvg extends RendererSVG{
	/**
	* Le logo de l'Emn
	*/
	private DrawEmn de;
	
	public DrawEmnSvg(Instruction ins) {
		this.de = (DrawEmn) ins;
	}
	public void render(SVGGraphics2D g2d) {
		for(Instruction ins: this.de.getInstructions()) {
			FactorySVG.makeRendererFrom(ins).render(g2d);
		}
	}
}