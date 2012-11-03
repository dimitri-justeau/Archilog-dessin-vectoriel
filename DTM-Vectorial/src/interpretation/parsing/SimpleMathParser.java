package interpretation.parsing;

import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class SimpleMathParser implements MathParser{

	private org.nfunk.jep.JEP mathParser;
	
	public SimpleMathParser(){
		this.mathParser = new org.nfunk.jep.JEP();
		this.mathParser.addStandardConstants();
		this.mathParser.addStandardFunctions();
	}
	
	public int parseExpression(String mathExpression) throws ParseException {
		Node n = mathParser.parse(mathExpression);
		double d = (Double) mathParser.evaluate(n);
		return  (int) d;
	}

	public void addVariable(String name, int value) {
		mathParser.addVariable(name, value);
	}
	
	public static void main(String[] args){
		SimpleMathParser m = new SimpleMathParser();
		m.addVariable("i", 0);
		try {
			System.out.println(m.parseExpression("i+3"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
