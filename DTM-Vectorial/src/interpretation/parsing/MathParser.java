package interpretation.parsing;

import org.nfunk.jep.ParseException;

public interface MathParser {
	
	/**
	 * @param mathExpression
	 * @return Le résultat de l'expression mathématique,
	 * doit prendre en compte les variables déjà déclarées
	 * @throws ParseException 
	 */
	public int parseExpression(String mathExpression) throws ParseException;
	
	/**
	 * Ajoute une variable au parseur, ou la modifie si
	 * elle y est déjà présente
	 * @param name
	 * @param value
	 */
	public void addVariable(String name, int value);
}
