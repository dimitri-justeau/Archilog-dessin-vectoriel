package rendering.java2d.renderers;

import java.awt.Graphics2D;

import model.variables.Point;
import model.variables.Polygon;
import model.variables.Circle;
import model.instruction.functions.FillShape;
import model.instruction.Instruction;

import rendering.java2d.RendererGraphics2D;
import rendering.java2d.Util;

public class FillShapeGraphics2D extends RendererGraphics2D{

	FillShape fillshape;
	
	public FillShapeGraphics2D(Instruction fillshape){
		this.fillshape = (FillShape) fillshape;
	}
	
	@Override
	public void render(Graphics2D g2d) {
		// On spécifie la couleur dans un premier temps
				g2d.setColor( Util.getColorAwt(this.fillshape.getColor()) );
				if(this.fillshape.getShape() instanceof Polygon){
					java.awt.Polygon s = new java.awt.Polygon();
					for(Point p :this.fillshape.getShape().getPoints()){
						s.addPoint(p.getX(), p.getY());
					}
					g2d.fill(s);
				} else
				if (this.fillshape.getShape() instanceof Circle){
					Circle c = (Circle) this.fillshape.getShape();
					g2d.fillOval(c.getPosition().getX(),
							c.getPosition().getY(),
							(int)c.getRayon(),
							(int)c.getRayon());
				}
	}

}
