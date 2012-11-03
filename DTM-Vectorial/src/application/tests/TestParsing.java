package application.tests;

import interpretation.Client;
import interpretation.Context;
import interpretation.parsing.Parser;
import interpretation.parsing.SimpleParser;

import java.io.File;

import model.Model;
import rendering.java2d.VisitorGraphics2D;

public class TestParsing {

	public static void main(String[] args){
		
		Context context = new Context(new Model());
		Parser parser = new SimpleParser(new File("test.dtm"));
		Client client = new Client(context, parser);
		client.evaluate();
		
		VisitorGraphics2D v = new VisitorGraphics2D(context.getModel());
		v.visitModel();
		v.render();
	}
}
