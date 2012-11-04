package interpretation;

import model.Model;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:39
 */
public class Context {

	/**
	 * Le model que le contexte r�f�rence
	 */
	private Model model;

	/**
	 * Le MathModel utilis� pour la gestion des op�rations
	 */
	private MathModel mathModel;

	public Context(Model model, MathModel mathModel){
		this.model = model;
		this.mathModel = mathModel;
	}

	/**
	 * @return Le mod�le r�f�renc� par le contexte
	 */
	public Model getModel(){
		return this.model;
	}
	
	/**
	 * @return Le MathModel r�f�renc� par le contexte
	 */
	public MathModel getMathModel() {
		return mathModel;
	}
	
	public void reset(){
		this.model.reset();
	}
	
}