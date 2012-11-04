package interpretation.expressions.model.variables;

import interpretation.Context;
import interpretation.expressions.model.VariableExpression;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.variables.Point;
import model.variables.Shape;

public class EShape extends VariableExpression {

	List<String> points;
	
	public EShape(String name, List<String> points) {
		super(name);
		this.points = points;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		List<Point> pts = new ArrayList<Point>();
		for(String p : points){
			Point pt = (Point) context.getModel().getVariable(p);
			pts.add(pt);
		}
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Shape(name, pts));
		return list;
	}

}
