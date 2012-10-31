package interpretation.expressions.terminal.variables;

import java.util.ArrayList;
import java.util.List;

import model.variables.Point;
import model.variables.Polygon;
import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EPolygon extends VariableExpression {

List<String> points;
	
	public EPolygon(String name, List<String> points) {
		super(name);
		this.points = points;
	}

	public void interpret(Context context) {
		List<Point> pts = new ArrayList<Point>();
		for(String p : points){
			Point pt = (Point) context.getModel().getVariable(p);
			pts.add(pt);
		}
		Polygon poly = new Polygon(name, pts);
		context.getModel().putVariable(poly);
	}

}
