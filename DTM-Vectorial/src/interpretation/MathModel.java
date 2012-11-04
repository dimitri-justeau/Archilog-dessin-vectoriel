package interpretation;

import org.nfunk.jep.ParseException;

public interface MathModel {
	
	/**
	 * @param mathExpression
	 * @return Le r�sultat de l'expression math�matique,
	 * doit prendre en compte les variables d�j� d�clar�es
	 * @throws ParseException 
	 */
	public double parseExpression(String mathExpression) throws ParseException;
	
	/**
	 * Ajoute un nombre au parseur, ou la modifie si
	 * elle y est d�j� pr�sente
	 * @param name
	 * @param value
	 */
	public void addNumber(Number number);
}
