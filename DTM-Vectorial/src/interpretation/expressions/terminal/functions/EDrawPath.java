package interpretation.expressions.terminal.functions;

import model.Picture;
import model.instruction.functions.DrawPath;
import model.variables.Color;
import model.variables.Path;
import model.variables.Pen;
import interpretation.Context;
import interpretation.expressions.terminal.InstructionExpression;

public class EDrawPath extends InstructionExpression {

	String path, pen, color;
	
	public EDrawPath(String picture, String path, String pen, String color) {
		super(picture);
		this.path = path;
		this.pen = pen;
		this.color = color;
	}

	public void interpret(Context context) {
		Picture pic = context.getModel().getPicture(picture);
		Path chemin = (Path) context.getModel().getVariable(path);
		Pen crayon = (Pen) context.getModel().getVariable(pen);
		Color couleur = (Color) context.getModel().getVariable(color);
		DrawPath dp = new DrawPath(pic, chemin, crayon, couleur);
		pic.addInstruction(dp);
		
	}
	
}
