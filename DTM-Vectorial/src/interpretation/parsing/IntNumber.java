package interpretation.parsing;

import model.variables.Variable;

/**
 * Correspond à un entier
 */
public class IntNumber extends Variable{
	
	private int value;
	
	public IntNumber(String name, int value) {
		super(name);
		this.value = value;
	}

	/**
	 * @return La valeur du nombre associé à l'expression (pour le parseur
	 * mathématique)
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Change la valeur liée à l'expression
	 * @param value
	 */
	public void setValue(int value){
		this.value = value;
	}

	/**
	 * Renvoie le nom de l'entier lié à l'expression
	 */
	public String getName(){
		return this.name;
	}
}
