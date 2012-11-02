package interpretation.expressions.terminal.variables;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
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

	public List<ModelObject> generateModelObject(Context context) {
		List<Point> pts = new ArrayList<Point>();
		for(String p : points){
			Point pt = (Point) context.getModel().getVariable(p);
			pts.add(pt);
		}
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Polygon(name, pts));
		return list;
	}

}
