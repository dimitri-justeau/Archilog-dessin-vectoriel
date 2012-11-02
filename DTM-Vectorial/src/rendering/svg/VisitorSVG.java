package rendering.svg;

import java.util.LinkedHashMap;

import java.util.Map;

import javax.swing.JFrame;



import model.Model;
import model.Picture;
import rendering.Visitor;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:19
 */
public class VisitorSVG extends Visitor {

	private Map<Picture, PaneGraphicsSVG> renderer;

	public VisitorSVG(Model model) {
		super(model);
		setRenderer(new LinkedHashMap<Picture, PaneGraphicsSVG>());
		// TODO Auto-generated constructor stub
	}

	public void visitModel(){
		setRenderer(FactorySVG.makeRendererGraphicsSVG(getModel()));
	}

	public void render(){
		for(Picture p : renderer.keySet()){

			JFrame f = new JFrame(p.getName());
			f.setContentPane(renderer.get(p));
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocationRelativeTo(null);
			f.setSize( (int)p.getWidth(), (int)p.getHeight());
			f.setVisible(true);
		}

	}

	public Map<Picture, PaneGraphicsSVG> getRenderer() {
		return renderer;
	}

	public void setRenderer(Map<Picture, PaneGraphicsSVG> renderer) {
		this.renderer = renderer;
	}


}