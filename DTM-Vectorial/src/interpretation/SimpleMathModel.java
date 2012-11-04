package interpretation;


import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class SimpleMathModel implements MathModel{

	private org.nfunk.jep.JEP jep;
	
	public SimpleMathModel(){
		this.jep = new org.nfunk.jep.JEP();
		this.jep.addStandardConstants();
		this.jep.addStandardFunctions();
	}
	
	public double parseExpression(String mathExpression) throws ParseException {
		Node n = jep.parse(mathExpression);
		double d = (Double) jep.evaluate(n);
		return d;
	}

	public void addNumber(Number number) {
		jep.addVariable(number.getName(), number.getValue());
	}

	public boolean evaluate(String assertion) throws ParseException {
		double b = (Double) jep.evaluate(jep.parse(assertion));
		boolean retour = b == 1.0 ? true : false;
		return retour;
	}

}
