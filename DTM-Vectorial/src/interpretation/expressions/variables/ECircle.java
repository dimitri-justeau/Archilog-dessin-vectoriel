package interpretation.expressions.variables;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.variables.Circle;
import model.variables.Point;
import interpretation.Context;
import interpretation.expressions.VariableExpression;

public class ECircle extends VariableExpression {

	String position;
	double rayon;
	
	public ECircle(String name, String position, double rayon) {
		super(name);
		this.position = position;
		this.rayon = rayon;
	}

	public List<ModelObject> generateModelObject(Context context) {
		Point center = (Point) context.getModel().getVariable(position);
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Circle(name, center, rayon));
		return list;
	}

}
