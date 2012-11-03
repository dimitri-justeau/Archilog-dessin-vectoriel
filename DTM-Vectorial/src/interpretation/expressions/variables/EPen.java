package interpretation.expressions.variables;

import interpretation.Context;
import interpretation.expressions.VariableExpression;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.variables.Pen;

public class EPen extends VariableExpression {

	String color, type;
	int stroke;
	
	public EPen(String name, String type, String color, int stroke) {
		super(name);
		this.type = type;
		this.color = color;
		this.stroke = stroke;
	}

	public List<ModelObject> generateModelObject(Context context) {
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Pen(name, type, stroke));
		return list;
	}

}
