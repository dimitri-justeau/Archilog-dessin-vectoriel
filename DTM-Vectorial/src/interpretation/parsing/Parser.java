package interpretation.parsing;

import interpretation.expressions.AbstractExpression;

import java.util.List;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:00
 */
public interface Parser {

	/**
	 * Parse un fichier correspondant à un script et renvoie 
	 * l'abre d'expressions correspondant à celui-ci
	 * @param file
	 * @throws Exception 
	 */
	public List<AbstractExpression> parse() 
			throws Exception;

}