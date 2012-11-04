package rendering.svg.renderers;

import java.awt.Font;

import model.instruction.functions.DrawLabel;

import org.apache.batik.svggen.SVGGraphics2D;

import rendering.java2d.Util;
import rendering.svg.RendererSVG;

public class DrawLabelSVG extends RendererSVG{

	private DrawLabel dl;
	
	public DrawLabelSVG(DrawLabel dl) {
		this.setDl(dl);
	}
	
	@Override
	public void render(SVGGraphics2D g2d) {
		// On specifie la couleur dans un premier temps
		g2d.setColor(Util.getColorAwt(this.getDrawLabel().getColor()));
		// On specifie le pinceau avec lequel dessiner
		Font font = new Font("Calibri", Font.PLAIN, this.getDrawLabel().getSize());
		g2d.setFont(font);
		g2d.drawString(this.getDrawLabel().getText(), this.getDrawLabel().getPosition().getX(), 
						this.getDrawLabel().getPosition().getY());
	}

	/**
	 * @return the dl
	 */
	public DrawLabel getDrawLabel() {
		return dl;
	}

	/**
	 * @param dl the dl to set
	 */
	public void setDl(DrawLabel dl) {
		this.dl = dl;
	}

}
