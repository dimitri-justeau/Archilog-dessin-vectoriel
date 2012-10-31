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
import model.variables.Polygon;

public class TestJava2D {
	
	public static void main(String[] args) {
		
		// Creation du modele
		Model m = new Model();
		Picture p = new Picture("Check !!", 450, 200);
		
		Color r = new Color("Rouge", 200, 0, 0);
		Color b = new Color("Rouge", 0, 0, 200);
		
		List<Point> points = new ArrayList<Point>();
		points.add(new Point("p1", 30, 50));
		points.add(new Point("p2", 90, 150));
		points.add(new Point("p3", 30, 90));
		points.add(new Point("p4", 150, 10));
		DrawPath dp1 = new DrawPath(p, 
						new Bezier("bezier", points), 
						new Pen("Check ", null, r, 5), r);
		p.addInstruction(dp1);
		
		List<Point> points2 = new ArrayList<Point>();
		points2.add(new Point("P2-1", 250, 100));
		points2.add(new Point("P2-2", 220, 80));
		points2.add(new Point("P2-3", 220, 60));
		points2.add(new Point("P2-4", 250, 40));
		points2.add(new Point("P2-5", 280, 60));
		points2.add(new Point("P2-6", 280, 80));
		points2.add(new Point("P2-7", 250, 100));
		DrawPath dp2 = new DrawPath(p, 
				new Polygon("polygone", points2), 
				new Pen ("Pen2", null, b, 5), b);
		p.addInstruction(dp2);
		
		List<Point> points3 = new ArrayList<Point>();
		points3.add(new Point("P2-1", 350, 100));
		points3.add(new Point("P2-2", 320, 80));
		points3.add(new Point("P2-3", 320, 60));
		points3.add(new Point("P2-4", 350, 40));
		points3.add(new Point("P2-5", 380, 60));
		points3.add(new Point("P2-6", 380, 80));
		points3.add(new Point("P2-7", 350, 100));
		DrawPath dp3 = new DrawPath(p, 
				new Polygon("polygone", points3), 
				new Pen ("Pen2", null, b, 5), b);
		p.addInstruction(dp3);
		
		List<Point> points4 = new ArrayList<Point>();
		points4.add(new Point("p1", 250, 120));
		points4.add(new Point("p2", 290, 140));
		points4.add(new Point("p2", 310, 140));
		points4.add(new Point("p1", 350, 120));
		DrawPath dp4 = new DrawPath(p, 
						new Bezier("bezier", points4), 
						new Pen("Check ", null, b, 5), b);
		p.addInstruction(dp4);
		
		
		
		
		m.putPicture(p);
		
		// Visiteur
		VisitorGraphics2D v = new VisitorGraphics2D(m);
		v.visitModel();
		v.render();
	}

}
