package interpretation.expressions.model.functions;

import interpretation.Context;
import interpretation.expressions.model.FunctionExpression;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import model.Picture;
import model.instruction.functions.DrawSmiley;
import model.variables.Color;
import model.variables.Point;

public class EDrawSmiley extends FunctionExpression {

	String color, size, position;
	
	public EDrawSmiley(String pic, String color, String size, String position) {
		super(pic);
		this.size = size;
		this.position = position;
		this.color = color;
	}

	public List<ModelObject> generateModelObjects(Context context) {
		Picture pic = context.getModel().getPicture(picture);
		int siz;
		List<ModelObject> list = new ArrayList<ModelObject>();
		try {
			siz = (int) context.getMathModel().parseExpression(size);
			Point pos = (Point) context.getModel().getVariable(position);
			Color couleur = (Color) context.getModel().getVariable(color);
			list.add(new DrawSmiley(pic, couleur, siz, pos));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
