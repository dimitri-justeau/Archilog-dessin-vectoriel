package interpretation.expressions.terminal.variables;

import java.util.ArrayList;
import java.util.List;

import model.variables.Point;
import model.variables.Shape;

import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EShape extends VariableExpression {

	List<String> points;
	
	public EShape(String name, List<String> points) {
		super(name);
		this.points = points;
	}

	public void interpret(Context context) {
		List<Point> pts = new ArrayList<Point>();
		for(String p : points){
			Point pt = (Point) context.getModel().getVariable(p);
			pts.add(pt);
		}
		Shape shape = new Shape(name, pts);
		context.getModel().putVariable(shape);
	}

}
