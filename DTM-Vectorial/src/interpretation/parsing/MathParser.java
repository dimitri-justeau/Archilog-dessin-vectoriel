package interpretation.parsing;

import org.nfunk.jep.ParseException;

public interface MathParser {
	
	/**
	 * @param mathExpression
	 * @return Le r�sultat de l'expression math�matique,
	 * doit prendre en compte les variables d�j� d�clar�es
	 * @throws ParseException 
	 */
	public int parseExpression(String mathExpression) throws ParseException;
	
	/**
	 * Ajoute une variable au parseur, ou la modifie si
	 * elle y est d�j� pr�sente
	 * @param name
	 * @param value
	 */
	public void addVariable(String name, int value);
}
