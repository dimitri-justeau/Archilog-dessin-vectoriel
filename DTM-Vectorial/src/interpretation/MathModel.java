package interpretation;

import org.nfunk.jep.ParseException;

public interface MathModel {
	
	/**
	 * @param mathExpression
	 * @return Le résultat de l'expression mathématique,
	 * doit prendre en compte les variables déjà déclarées
	 * @throws ParseException 
	 */
	public double parseExpression(String mathExpression) throws ParseException;
	
	/**
	 * Ajoute un nombre au parseur, ou la modifie si
	 * elle y est déjà présente
	 * @param name
	 * @param value
	 */
	public void addNumber(Number number);
}
