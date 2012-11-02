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

	public Context(Model model){
		this.model = model;
	}

	/**
	 * @return Le modèle référencé par le contexte
	 */
	public Model getModel(){
		return this.model;
	}
	
	public void reset(){
		this.model.reset();
	}
}