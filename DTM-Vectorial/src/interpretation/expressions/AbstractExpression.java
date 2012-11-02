package interpretation.expressions;

import model.ModelObject;
import interpretation.Context;
import java.util.List;


/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:33
 */
public abstract class AbstractExpression {

	public AbstractExpression(){

	}

	/**
	 * Interprete l'expression dans le contexte (ie ajoute l'objet
	 * correspondant au modele du contexte)
	 * @param context
	 */
	public abstract void interpret(Context context);
	
	/**
	 * @return L'objet du mod�le que g�n�re cette expression
	 * @param context Le contexte
	 */
	public abstract List<ModelObject> generateModelObject(Context context);
}