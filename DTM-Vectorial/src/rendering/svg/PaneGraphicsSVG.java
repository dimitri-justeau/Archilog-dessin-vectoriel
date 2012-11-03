package rendering.svg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.swing.JSVGCanvas;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.svg.SVGDocument;
public class PaneGraphicsSVG extends JSVGCanvas{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * La liste des renderers Graphics2D a dessiner
	 * sur le Panel ou la picture 
	 */
	private List<RendererSVG> renderers;
	
	/**
	 * Nom de fichier où on gardera les informations du dessin-
	 */
	private String nom;
	/**
	 * 
	 */
	private SVGGraphics2D graphics;
	
	/**
	 * Constructeur de base du panel
	 */
	public PaneGraphicsSVG(String nom){
		super();
		this.nom = nom+".svg";
	   	DOMImplementation impl = SVGDOMImplementation.getDOMImplementation();
        String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
        SVGDocument doc = (SVGDocument) impl.createDocument(svgNS, "svg", null);
        System.out.println(doc);
        graphics = new SVGGraphics2D(doc);
		renderers = new ArrayList<RendererSVG>();
	}
	
	/**
	 * Methode permettant d'ajouter un renderer
	 * @param r
	 */
	public void addRenderer( RendererSVG r ){
		renderers.add(r);
	}
	/**
	 * Méthode permettant d'ajouter chaque renderer
	 * dans le fichier nom.
	 */
	public void paintComponent() {
		// On lance tous les renderers sur le SVGgraphics2D
		try {
			//super.paint(g);
			for(RendererSVG r : this.renderers){
				r.render(graphics);
			}
			graphics.stream(this.nom);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	

}