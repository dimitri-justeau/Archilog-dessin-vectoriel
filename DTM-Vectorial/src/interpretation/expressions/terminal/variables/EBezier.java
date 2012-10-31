package interpretation.expressions.terminal.variables;

import java.util.ArrayList;
import java.util.List;

import model.variables.Bezier;
import model.variables.Point;

import interpretation.Context;
import interpretation.expressions.terminal.VariableExpression;
/**
 * 
 * Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 *
 */
public class EBezier extends VariableExpression {

	List<String> points;
	
	public EBezier(String name, List<String> points) {
		super(name);
		this.points = points;	}

	public void interpret(Context context) {
		List<Point> pts = new ArrayList<Point>();
		for(String p : points){
			Point pt = (Point) context.getModel().getVariable(p);
			pts.add(pt);
		}
		Bezier bezier = new Bezier(name, pts);
		context.getModel().putVariable(bezier);
	}

}
