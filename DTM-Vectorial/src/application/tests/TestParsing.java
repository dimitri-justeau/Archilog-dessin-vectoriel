package application.tests;

import model.Model;
import rendering.java2d.VisitorGraphics2D;
import interpretation.parsing.*;
import interpretation.*;

public class TestParsing {

	public static void main(String[] args){
		
		Context context = new Context(new Model());
		Parser parser = new SimpleParser();
		Client client = new Client(context, parser, "script.dtm");
		client.evaluate();
		
		VisitorGraphics2D v = new VisitorGraphics2D(context.getModel());
		v.visitModel();
		v.render();
	}
}
