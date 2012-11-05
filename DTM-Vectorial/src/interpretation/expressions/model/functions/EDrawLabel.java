package interpretation.expressions.model.functions;

import interpretation.Context;
import interpretation.expressions.model.FunctionExpression;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.Picture;
import model.instruction.functions.DrawLabel;
import model.variables.Color;
import model.variables.Point;

import org.nfunk.jep.ParseException;

public class EDrawLabel extends FunctionExpression{

	private String position, color, size, text;
	
	public EDrawLabel(String picture, String color, String size, String pos, String text) {
		super(picture);
		this.position = pos;
		this.color = color;
		this.size = size;
		this.text = text;
	}

	@Override
	public List<ModelObject> generateModelObjects(Context context) {
		Picture pic = context.getModel().getPicture(picture);
		Point pos = (Point) context.getModel().getVariable(position);
		Color couleur = (Color) context.getModel().getVariable(color);
		int si = 0;
		try {
			si = (int) context.getMathModel().parseExpression(size);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new DrawLabel(pic, pos, couleur, si, text));
		return list;
	}

}
