package rendering.java2d;

import java.util.List;
import java.util.Map;

import model.Model;
import model.Picture;

import rendering.Visitor;
import rendering.java2d.RendererGraphics2D;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:15
 * 
 * Classe permettant d'effectuer un rendering sur un graphique2D
 * du modele
 */
public class VisitorGraphics2D extends Visitor {

	/**
	 * La liste des renderer
	 * Ce sont les objets qui dessinent sur le 
	 * Graphics2D en relation aux donnees du modele.
	 * <br/>
	 * On range ces objets dans une map dont l'index
	 * est la Picture, en effet chacun de ces dessins
	 * sont associes a une image ou une fenetre sur 
	 * laquelle on va dessiner
	 */
	private Map<Picture, List<RendererGraphics2D>> renderer;

	public VisitorGraphics2D(Model model){
		renderer = FactoryGraphics2D.makeRendererGraphics2D(model);
	}

	public void visitModel(){

	}

	public void render(){

	}

	/**
	 * @return the renderer
	 */
	public Map<Picture, List<RendererGraphics2D>> getRenderer() {
		return renderer;
	}

	/**
	 * @param renderer the renderer to set
	 */
	public void setRenderer(Map<Picture, List<RendererGraphics2D>> renderer) {
		this.renderer = renderer;
	}

	
}