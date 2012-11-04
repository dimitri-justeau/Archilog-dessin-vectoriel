package interpretation.expressions.model.variables;

import interpretation.Context;
import interpretation.expressions.model.VariableExpression;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import model.variables.Pen;

public class EPen extends VariableExpression {

	String type, stroke;
	
	public EPen(String name, String type, String stroke) {
		super(name);
		this.type = type;
		this.stroke = stroke;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		List<ModelObject> list = new ArrayList<ModelObject>();
		int str;
		try {
			str = (int) context.getMathModel().parseExpression(stroke);
			list.add(new Pen(name, type, str));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return list;
	}

}
