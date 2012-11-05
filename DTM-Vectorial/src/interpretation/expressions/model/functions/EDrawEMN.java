package interpretation.expressions.model.functions;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import model.Picture;
import model.instruction.functions.DrawEmn;
import model.variables.Color;
import model.variables.Point;
import interpretation.Context;
import interpretation.expressions.model.FunctionExpression;

public class EDrawEMN extends FunctionExpression{

	String color, position, largeur, hauteur;
	
	public EDrawEMN(String picture, String color, String position,
			String largeur, String hauteur) {
		super(picture);
		this.color = color;
		this.position = position;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	@Override
	public List<ModelObject> generateModelObjects(Context context) {
		List<ModelObject> retour = new ArrayList<ModelObject>();
		Picture pic = context.getModel().getPicture(picture);
		Color c = (Color) context.getModel().getVariable(color);
		Point pos = (Point) context.getModel().getVariable(position);
		int l;
		int h;
		try {
			l = (int) context.getMathModel().parseExpression(largeur);
			h = (int) context.getMathModel().parseExpression(hauteur);
			retour.add(new DrawEmn(pic, c, pos, l, h));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retour;
	}

	

}
