package rendering.java2d;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JFrame;

import model.Model;
import model.Picture;
import rendering.Visitor;



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
	 * <br/>
	 * De plus tous les renderers sont integres directement
	 * dans l'objet PaneGraphics2D, avec lequel on va pouvoir
	 * dessiner
	 */
	private Map<Picture, PaneGraphics2D> renderer;
	
	public VisitorGraphics2D(Model model){
		super(model);
		setRenderer(new LinkedHashMap<Picture, PaneGraphics2D>());
	}

	public void visitModel(){
		setRenderer(FactoryGraphics2D.makeRendererGraphics2D(getModel()));
	}

	public void render(){
		for(Picture p : renderer.keySet()){
			JFrame f = new JFrame(p.getName());
			f.setContentPane(renderer.get(p));
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setLocationRelativeTo(null);
			f.setSize( (int)p.getHeight(), (int)p.getWidth());
			f.setVisible(true);
		}
	}

	/**
	 * @return the renderer
	 */
	public Map<Picture, PaneGraphics2D> getRenderer() {
		return renderer;
	}

	/**
	 * @param renderer the renderer to set
	 */
	public void setRenderer(Map<Picture, PaneGraphics2D> renderer) {
		this.renderer = renderer;
	}

	
}