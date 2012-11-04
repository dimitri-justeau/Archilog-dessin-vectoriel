package interpretation.expressions.model.variables;

import interpretation.Context;
import interpretation.expressions.model.VariableExpression;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import model.variables.Color;

public class EColor extends VariableExpression {

	private String R,G,B;
	
	public EColor(String name, String R, String G, String B) {
		super(name);
		this.R = R;
		this.G = G;
		this.B = B;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		List<ModelObject> list = new ArrayList<ModelObject>();
		int r;
		try {
			r = (int) context.getMathModel().parseExpression(R);
			int g = (int) context.getMathModel().parseExpression(G);
			int b = (int) context.getMathModel().parseExpression(B);
			list.add(new Color(name, r, g, b));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return list;
	}

}
