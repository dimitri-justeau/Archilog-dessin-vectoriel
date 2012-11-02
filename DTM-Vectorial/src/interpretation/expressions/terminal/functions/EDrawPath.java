package interpretation.expressions.terminal.functions;

import java.util.ArrayList;
import java.util.List;

import model.ModelObject;
import model.Picture;
import model.instruction.functions.DrawPath;
import model.variables.Color;
import model.variables.Path;
import model.variables.Pen;
import interpretation.Context;
import interpretation.expressions.terminal.FunctionExpression;

public class EDrawPath extends FunctionExpression {

	String path, pen, color;
	
	public EDrawPath(String picture, String path, String pen, String color) {
		super(picture);
		this.path = path;
		this.pen = pen;
		this.color = color;
	}

	public List<ModelObject> generateModelObject(Context context) {
		Picture pic = context.getModel().getPicture(picture);
		Path chemin = (Path) context.getModel().getVariable(path);
		Pen crayon = (Pen) context.getModel().getVariable(pen);
		Color couleur = (Color) context.getModel().getVariable(color);
		List<ModelObject> list = new ArrayList<ModelObject>();
		list.add(new DrawPath(pic, chemin, crayon, couleur));
		return list;
	}
	
}
