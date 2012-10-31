package interpretation.expressions.terminal;

import model.Picture;
import interpretation.Context;
import interpretation.expressions.AbstractExpression;

public class EPicture extends AbstractExpression {

	String name;
	double width,height;
	
	public EPicture(String name, double width, double height){
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	public void interpret(Context context) {
		Picture pic = new Picture(this.name, this.width, this.height);
		context.getModel().putPicture(pic);
	}

}
