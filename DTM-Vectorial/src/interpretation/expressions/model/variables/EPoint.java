package interpretation.expressions.model.variables;

import interpretation.Context;
import interpretation.expressions.model.VariableExpression;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import model.variables.Point;

public class EPoint extends VariableExpression {

	String x, y;
	
	public EPoint(String name, String x, String y) {
		super(name);
		this.x = x;
		this.y = y;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		List<ModelObject> list = new ArrayList<ModelObject>();
		try {
			int X = (int) context.getMathModel().parseExpression(x);
			int Y = (int) context.getMathModel().parseExpression(y);
			list.add(new Point(name, X, Y));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
