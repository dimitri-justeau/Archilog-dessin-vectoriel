package rendering.java2d.renderers;

import java.awt.Font;
import java.awt.Graphics2D;

import model.instruction.functions.DrawLabel;
import rendering.java2d.RendererGraphics2D;
import rendering.java2d.Util;

public class DrawLabelGraphics2D extends RendererGraphics2D{

	private DrawLabel drawLabel;
	
	public DrawLabelGraphics2D(DrawLabel dl) {
		super();
		this.setDrawLabel(dl);
	}
	
	@Override
	public void render(Graphics2D g2d) {
		// On specifie la couleur dans un premier temps
		g2d.setColor(Util.getColorAwt(this.getDrawLabel().getColor()));
		// On specifie le pinceau avec lequel dessiner
		Font font = new Font("Calibri", Font.PLAIN, this.getDrawLabel().getSize());
		g2d.setFont(font);
		g2d.drawString(this.getDrawLabel().getText(), this.getDrawLabel().getPosition().getX(), 
						this.getDrawLabel().getPosition().getY());
	}

	/**
	 * @return the drawLabel
	 */
	public DrawLabel getDrawLabel() {
		return drawLabel;
	}

	/**
	 * @param drawLabel the drawLabel to set
	 */
	public void setDrawLabel(DrawLabel drawLabel) {
		this.drawLabel = drawLabel;
	}

}
