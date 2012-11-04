package interpretation.expressions.model.variables;

import interpretation.Context;
import interpretation.expressions.model.VariableExpression;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import model.variables.Point;
import model.variables.Square;
/**
 * Classe abstraite pour desinner un carr�
 * @author Andres Gutierrez
 *
 */
public class ESquare extends VariableExpression {

	String position, width;
	
	public ESquare(String name, String position, String width) {
		super(name);
		this.position = position;
		this.width = width;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		Point pos = (Point) context.getModel().getVariable(position);
		List<ModelObject> list = new ArrayList<ModelObject>();
		try {
			double w = context.getMathModel().parseExpression(width);
			list.add(new Square(name, pos, w));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
