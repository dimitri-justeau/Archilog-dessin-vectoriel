package interpretation.expressions.terminal.variables;

import java.util.ArrayList;
import java.util.List;

import model.variables.Path;
import model.variables.Point;

import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;

public class EPath extends VariableExpression {

	List<String> points;
	
	public EPath(String name, List<String> points) {
		super(name);
		this.points = points;
	}

	public void interpret(Context context) {
		List<Point> pts = new ArrayList<Point>();
		for(String p : points){
			Point pt = (Point) context.getModel().getVariable(p);
			pts.add(pt);
		}
		Path path = new Path(name, pts);
		context.getModel().putVariable(path);
	}

}
