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

}
