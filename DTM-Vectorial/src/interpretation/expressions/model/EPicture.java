package interpretation.expressions.model;

import java.util.List;

import org.nfunk.jep.ParseException;

import model.ModelObject;
import model.Picture;
import interpretation.Context;

public class EPicture extends ModelExpression {

	String name, width, height;
	
	public EPicture(String name, String width, String height){
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	public void interpret(Context context) {
		double w,h;
		try {
			w = context.getMathModel().parseExpression(width);
			h = context.getMathModel().parseExpression(height);
			Picture pic = new Picture(this.name, w, h);
			context.getModel().putPicture(pic);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public List<ModelObject> generateModelObjects(Context context) {
		return null;
	}

}
