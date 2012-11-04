package interpretation;

/**
 * Représente un nombre du modèle mathématique
 */
public class Number {

	private String name;
	private double value;
	
	public Number(String name, double value){
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
