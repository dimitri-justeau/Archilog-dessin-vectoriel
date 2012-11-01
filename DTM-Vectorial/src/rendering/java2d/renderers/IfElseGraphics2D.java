package rendering.java2d.renderers;

import java.awt.Graphics2D;

import model.instruction.operators.Ifelse;

import rendering.java2d.FactoryGraphics2D;
import rendering.java2d.RendererGraphics2D;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:43
 */
public class IfElseGraphics2D extends RendererGraphics2D {

	/**
	 * L'objet IfElse du Modele
	 */
	private Ifelse ifElse;
	
	public IfElseGraphics2D(Ifelse ie){
		this.ifElse = ie;
	}

	@Override
	public void render(Graphics2D g2d) {
		if(ifElse.isTrue())
			FactoryGraphics2D.makeRendererFrom(ifElse.getIfTrue()).render(g2d);
		else
			FactoryGraphics2D.makeRendererFrom(ifElse.getIfFalse()).render(g2d);
	}


}