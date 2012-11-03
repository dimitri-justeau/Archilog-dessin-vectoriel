package interpretation.expressions.variables;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.variables.Color;
import model.variables.Pen;
import interpretation.Context;
import interpretation.expressions.VariableExpression;

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
		Color c = (Color) context.getModel().getVariable(color);
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Pen(name, type, stroke));
		return list;
	}

}
