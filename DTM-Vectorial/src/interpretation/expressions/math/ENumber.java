package interpretation.expressions.math;

import org.nfunk.jep.ParseException;

import interpretation.Context;
import interpretation.Number;

/**
 * Expression correspondant � la d�claration ou la modification de la valeur
 * d'une variable dans le script
 */
public class ENumber extends MathExpression {

	/**
	 * Le nom de la variable, et l'expression correspondant
	 * � sa valeur (pouvant �tre compos�e d'op�rations)
	 */
	private String name, expression;
	
	public ENumber(String name, String expression){
		this.name = name;
		this.expression = expression;
	}
	
	public void interpret(Context context) {
		double value;
		try {
			value = context.getMathModel().parseExpression(expression);
			context.getMathModel().addNumber(new Number(name, value));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
