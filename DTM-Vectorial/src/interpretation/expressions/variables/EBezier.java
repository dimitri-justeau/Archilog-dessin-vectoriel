package interpretation.expressions.variables;

import interpretation.Context;
import interpretation.expressions.VariableExpression;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.variables.Bezier;
import model.variables.Point;
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

	public List<ModelObject> generateModelObject(Context context) {
		List<Point> pts = new ArrayList<Point>();
		for(String p : points){
			Point pt = (Point) context.getModel().getVariable(p);
			pts.add(pt);
		}
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Bezier(name, pts));
		return list;
	}

}
