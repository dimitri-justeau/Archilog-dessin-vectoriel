package rendering.testing;

import java.util.ArrayList;
import java.util.List;

import rendering.java2d.VisitorGraphics2D;

import model.Model;
import model.Picture;
import model.instruction.functions.DrawPath;
import model.variables.Bezier;
import model.variables.Color;
import model.variables.Pen;
import model.variables.Point;

public class TestJava2D {
	
	public static void main(String[] args) {
		
		// Creation du modele
		Model m = new Model();
		Picture p = new Picture("Test 1", 200, 400);
		
		Color r = new Color("Rouge", 200, 0, 0);
		
		List<Point> points = new ArrayList<Point>();
		points.add(new Point("p1", 30, 50));
		points.add(new Point("p2", 90, 150));
		points.add(new Point("p3", 30, 90));
		points.add(new Point("p4", 150, 10));
		DrawPath dp1 = new DrawPath(p, 
						new Bezier("bezier", points), 
						new Pen("pen1", null, r, 2), r);
		p.addInstruction(dp1);
		m.putPicture(p);
		
		// Visiteur
		VisitorGraphics2D v = new VisitorGraphics2D(m);
		v.visitModel();
		v.render();
	}

}
