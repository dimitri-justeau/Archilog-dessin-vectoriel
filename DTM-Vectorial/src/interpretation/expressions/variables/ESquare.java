package interpretation.expressions.variables;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.variables.Point;
import model.variables.Square;
import interpretation.Context;
import interpretation.expressions.VariableExpression;
/**
 * Classe abstraite pour desinner un carr�
 * @author Andres Gutierrez
 *
 */
public class ESquare extends VariableExpression {

	String position;
	double width;
	
	public ESquare(String name, String position, double width) {
		super(name);
		this.position = position;
		this.width = width;
	}

	public List<ModelObject> generateModelObject(Context context) {
		Point pos = (Point) context.getModel().getVariable(position);
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new Square(name, pos, width));
		return list;
	}

}
