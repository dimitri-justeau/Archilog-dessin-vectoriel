package interpretation.expressions.variables;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.variables.Point;
import interpretation.Context;
import interpretation.expressions.VariableExpression;

public class EPoint extends VariableExpression {

	int x, y;
	
	public EPoint(String name, int x, int y) {
		super(name);
		this.x = x;
		this.y = y;
	}

	public List<ModelObject> generateModelObject(Context context) {
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Point(name, x, y));
		return list;
	}

}
