package rendering.svg.renderers;

import org.apache.batik.svggen.SVGGraphics2D;

import model.instruction.Instruction;
import model.instruction.functions.FillShape;
import model.variables.Circle;
import model.variables.Point;
import model.variables.Polygon;
import rendering.java2d.Util;
import rendering.svg.RendererSVG;

public class FillShapeSVG extends RendererSVG{
	FillShape fillshape;
	
	public FillShapeSVG(Instruction fillshape){
		this.fillshape = (FillShape) fillshape;
	}
	
	@Override
	public void render(SVGGraphics2D g2d) {
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
