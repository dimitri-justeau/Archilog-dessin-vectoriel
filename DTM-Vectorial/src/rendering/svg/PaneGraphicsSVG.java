package rendering.svg;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import org.apache.batik.swing.JSVGCanvas;

import rendering.java2d.RendererGraphics2D;


public class PaneGraphicsSVG extends JSVGCanvas{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * La liste des renderers Graphics2D a dessiner
	 * sur le Panel ou la picture 
	 */
	private List<RendererSVG> renderers;
	
	/**
	 * Constructeur de base du panel
	 */
	public PaneGraphicsSVG(){
		super();
		renderers = new ArrayList<RendererSVG>();
	}
	
	/**
	 * Methode permettant d'ajouter le renderer
	 * au panel
	 * @param r
	 */
	public void addRenderer( RendererSVG r ){
		renderers.add(r);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// On lance tous les renderers sur le graphics2D
		for(RendererSVG r : this.renderers)
			r.render(g);
	}
	

}