package rendering.java2d;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import model.Model;
import model.Picture;
import model.instruction.Function;
import model.instruction.Instruction;
import model.instruction.Operator;
import model.instruction.functions.DrawPath;
import model.instruction.functions.DrawSmiley;
import model.variables.Bezier;
import model.variables.Circle;
import model.variables.Path;
import model.variables.Polygon;
import rendering.java2d.renderers.DrawBezierGraphics2D;
import rendering.java2d.renderers.DrawCircleGraphics2D;
import rendering.java2d.renderers.DrawPolygoneGraphics2D;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:48
 * 
 * La fabrique des
 * renderer sur le Graphics2D
 */
public class FactoryGraphics2D {

	/**
	 * Le constructueur
	 */
	public FactoryGraphics2D(){}

	/**
	 * Methode de factory
	 * @param model
	 * @return tous les renderer graphics2D lies aux donnees du modele
	 * classe par picture dans une LinkedHashMap
	 */
	public static Map<Picture, List<RendererGraphics2D>> makeRendererGraphics2D(Model model){
		Map<Picture, List<RendererGraphics2D>> map = 
				new LinkedHashMap<Picture, List<RendererGraphics2D>>();
		for(Picture pic : model.getListPictures())
			makeRendererGraphics2D(pic, map);
		return map;
	}

	/**
	 * Genere la liste des renderer pour une picture donnee
	 * @param pic
	 * @param map
	 */
	private static void makeRendererGraphics2D(Picture pic,
			Map<Picture, List<RendererGraphics2D>> map) {
		List<RendererGraphics2D> renderer = new ArrayList<RendererGraphics2D>();
		for(Instruction ins : pic.getInstructions())
			renderer.add(makeRendererFrom(ins));
		map.put(pic, renderer);
	}

	/**
	 * Methode qui va retourner le renderer graphics 2D
	 * associe a l'instruction en parametre du modele
	 * @param ins
	 * @return
	 */
	private static RendererGraphics2D makeRendererFrom(Instruction ins) {
		if ( ins instanceof Operator){
			
		} 
		
		else if (ins instanceof Function){
			
			if (ins instanceof DrawPath){
				Path path = ((DrawPath)ins).getPath();
				if( path instanceof Circle )
					return new DrawCircleGraphics2D((DrawPath)ins);
				else if ( path instanceof Polygon )
					return new DrawPolygoneGraphics2D((DrawPath) ins);
				else if ( path instanceof Bezier )
					return new DrawBezierGraphics2D((DrawPath) ins);
			} 
			
			else if ( ins instanceof DrawSmiley ){
				
			}
		}
		return null;
	}

}