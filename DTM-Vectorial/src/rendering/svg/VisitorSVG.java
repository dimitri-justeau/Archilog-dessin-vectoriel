package rendering.svg;

import java.util.LinkedHashMap;

import java.util.Map;

import javax.swing.JOptionPane;



import model.Model;
import model.Picture;
import rendering.Visitor;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:19
 */
public class VisitorSVG extends Visitor {

	/**
	 * Le Map de tous les dessins chacun ayant un PaneGraphicsSVG associé.
	 */
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

			renderer.get(p).paintComponent();
			String url = p.getName()+".svg";
			String osName = System.getProperty("os.name");
			try {
			if (osName.startsWith("Windows"))
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			else { 
			String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
			String browser = null;
			for (int count = 0; count < browsers.length && browser == null; count++)
			if (Runtime.getRuntime().exec(new String[] {"which", browsers[count]}).waitFor() == 0)
			browser = browsers[count];
			Runtime.getRuntime().exec(new String[] {browser, url});
			}
			}
			catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error in opening browser" + ":\n" + e.getLocalizedMessage());
			}
		}

	}

	public Map<Picture, PaneGraphicsSVG> getRenderer() {
		return renderer;
	}

	public void setRenderer(Map<Picture, PaneGraphicsSVG> renderer) {
		this.renderer = renderer;
	}


}