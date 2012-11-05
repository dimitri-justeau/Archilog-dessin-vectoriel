package interpretation.expressions.model.operators;

import java.util.ArrayList;
import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import model.Picture;
import model.variables.Color;
import model.instruction.functions.DrawEmn;
import model.instruction.functions.DrawLabel;
import model.variables.Point;
import interpretation.Context;
import interpretation.expressions.model.InstructionExpression;

public class EApproval extends InstructionExpression {

	private String picture, note, position, size;
	
	public EApproval(String picture, String note, String position, String size){
		this.picture = picture;
		this.note = note;
		this.position = position;
		this.size = size;
	}
	
	public List<ModelObject> generateModelObjects(Context context) {
		List<ModelObject> retour = new ArrayList<ModelObject>();
		try {
			Picture pic = context.getModel().getPicture(picture);
			double result = context.getMathModel().parseExpression(note);
			Point p = (Point) context.getModel().getVariable(position);
			int s = (int) context.getMathModel().parseExpression(size);
			if(result >= 10){
				Color c = new Color("" ,55, 232, 32);
				retour.add(new DrawEmn(pic,
						c, p, 2*s, s));
				retour.add(new DrawLabel(pic,
						new Point("", (int) (p.getX()*(0.8)), (int) (p.getY()+(1.5)*s)),
						c, (int) (s*0.5), "APPROVED"));
			}
			else{
				Color c = new Color("" ,214, 10, 10);
				retour.add(new DrawEmn(pic,
						c, p, 2*s, s));
				retour.add(new DrawLabel(pic,
						new Point("", (int) (p.getX()*(0.75)), (int) (p.getY()+(1.4)*s)),
						c, (int) (s*0.4), "DISAPPROVED"));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return retour;
	}

}
