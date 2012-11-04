package application.tests;

import java.io.File;

import model.Model;
import rendering.Visitor;
import rendering.java2d.VisitorGraphics2D;
import rendering.svg.VisitorSVG;
import interpretation.parsing.*;
import interpretation.*;

public class Test {

	public static void main(String[] args){
		
		// GENERATION DU MODELE
		MathModel mathModel = new SimpleMathModel();
		Model model = new Model();
		Context context = new Context(model, mathModel);
		Parser parser = new SimpleParser(new File("test.dtm"));
		Client client = new Client(context, parser);
		client.evaluate();
		
		// RENDU GRAPHICS2D
		Visitor v = new VisitorGraphics2D(context.getModel());
		v.visitModel();
		v.render();
		
		// RENDU SVG
		v = new VisitorSVG(context.getModel());
		v.visitModel();
		v.render();
		
	}
}
