package interpretation.expressions.model;

import model.ModelObject;
import interpretation.Context;
import interpretation.expressions.AbstractExpression;

import java.util.List;


/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:32:33
 */
public abstract class ModelExpression extends AbstractExpression{

	/**
	 * @return L'objet du modèle que génère cette expression
	 * @param context Le contexte
	 */
	public abstract List<ModelObject> generateModelObjects(Context context);
}