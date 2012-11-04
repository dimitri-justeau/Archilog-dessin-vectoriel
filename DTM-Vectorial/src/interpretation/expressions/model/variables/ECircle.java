package interpretation.expressions.model.variables;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import model.variables.Circle;
import model.variables.Point;
import interpretation.Context;
import interpretation.expressions.model.VariableExpression;

public class ECircle extends VariableExpression {

	private String position, rayon;
	
	public ECircle(String name, String position, String rayon) {
		super(name);
		this.position = position;
		this.rayon = rayon;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		Point center = (Point) context.getModel().getVariable(position);
		List<ModelObject> list = new ArrayList<ModelObject>();
		double r;
		try {
			r = context.getMathModel().parseExpression(rayon);
			list.add(new Circle(name, center, r));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return list;
	}

}
