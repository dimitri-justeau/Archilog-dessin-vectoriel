package interpretation.parsing;

import model.variables.Variable;

/**
 * Correspond � un entier
 */
public class IntNumber extends Variable{
	
	private int value;
	
	public IntNumber(String name, int value) {
		super(name);
		this.value = value;
	}

	/**
	 * @return La valeur du nombre associ� � l'expression (pour le parseur
	 * math�matique)
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Change la valeur li�e � l'expression
	 * @param value
	 */
	public void setValue(int value){
		this.value = value;
	}

	/**
	 * Renvoie le nom de l'entier li� � l'expression
	 */
	public String getName(){
		return this.name;
	}
}
