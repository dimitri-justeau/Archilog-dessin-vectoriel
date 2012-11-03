package interpretation.expressions.variables;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.variables.Path;
import model.variables.Point;

import interpretation.Context;
import interpretation.expressions.VariableExpression;

public class EPath extends VariableExpression {

	List<String> points;
	
	public EPath(String name, List<String> points) {
		super(name);
		this.points = points;
	}

	public List<ModelObject> generateModelObject(Context context) {
		List<Point> pts = new ArrayList<Point>();
		for(String p : points){
			Point pt = (Point) context.getModel().getVariable(p);
			pts.add(pt);
		}
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Path(name, pts));
		return list;
	}

}
