package interpretation.expressions.model.functions;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.Picture;
import model.instruction.functions.FillShape;
import model.variables.Color;
import model.variables.Shape;
import interpretation.Context;
import interpretation.expressions.model.FunctionExpression;

public class EFillShape extends FunctionExpression{

	String shape, color;
	
	public EFillShape(String picture, String shape, String color) {
		super(picture);
		this.shape = shape;
		this.color = color;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		List<ModelObject> retour = new ArrayList<ModelObject>();
		Picture pic = context.getModel().getPicture(picture);
		Shape s = (Shape) context.getModel().getVariable(shape);
		Color c = (Color) context.getModel().getVariable(color);
		retour.add(new FillShape(pic, s, c));
		return retour;
	}

	

}
