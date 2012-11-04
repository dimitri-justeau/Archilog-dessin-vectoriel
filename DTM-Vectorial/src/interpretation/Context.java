package interpretation;

import model.Model;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:39
 */
public class Context {

	/**
	 * Le model que le contexte référence
	 */
	private Model model;

	/**
	 * Le MathModel utilisé pour la gestion des opérations
	 */
	private MathModel mathModel;

	public Context(Model model, MathModel mathModel){
		this.model = model;
		this.mathModel = mathModel;
	}

	/**
	 * @return Le modèle référencé par le contexte
	 */
	public Model getModel(){
		return this.model;
	}
	
	/**
	 * @return Le MathModel référencé par le contexte
	 */
	public MathModel getMathModel() {
		return mathModel;
	}
	
	public void reset(){
		this.model.reset();
	}
	
}