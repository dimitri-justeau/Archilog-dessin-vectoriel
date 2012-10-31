package rendering.java2d;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * Classe qui va permettre de representer la picture
 * sur le graphics 2D
 */
public class PaneGraphics2D extends JPanel{

	/**
	 * La liste des renderers Graphics2D a dessiner
	 * sur le Panel ou la picture 
	 */
	private List<RendererGraphics2D> renderers;
	
	/**
	 * Constructeur de base du panel
	 */
	public PaneGraphics2D(){
		super();
		renderers = new ArrayList<RendererGraphics2D>();
	}
	
	/**
	 * Methode permettant d'ajouter le renderer
	 * au panel
	 * @param r
	 */
	public void addRenderer( RendererGraphics2D r ){
		renderers.add(r);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// On lance tous les renderers sur le graphics2D
		for(RendererGraphics2D r : this.renderers)
			r.render(g);
	}
}
