package application.tests;

import java.io.File;

import model.Model;
import rendering.java2d.VisitorGraphics2D;
import interpretation.parsing.*;
import interpretation.*;

public class TestParsing {

	public static void main(String[] args){
		
		MathModel mathModel = new SimpleMathModel();
		Model model = new Model();
		Context context = new Context(model, mathModel);
		Parser parser = new SimpleParser(new File("test.dtm"));
		Client client = new Client(context, parser);
		client.evaluate();
		
		VisitorGraphics2D v = new VisitorGraphics2D(context.getModel());
		v.visitModel();
		v.render();
	}
}
