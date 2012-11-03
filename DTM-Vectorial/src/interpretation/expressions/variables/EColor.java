package interpretation.expressions.variables;

import interpretation.Context;
import interpretation.expressions.VariableExpression;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.variables.Color;

public class EColor extends VariableExpression {

	int R,G,B;
	
	public EColor(String name, int R, int G, int B) {
		super(name);
		this.R = R;
		this.G = G;
		this.B = B;
	}

	public List<ModelObject> generateModelObject(Context context) {
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Color(name, R, G, B));
		return list;
	}

}
