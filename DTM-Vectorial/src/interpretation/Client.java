package interpretation;

import interpretation.expressions.AbstractExpression;
import interpretation.parsing.Parser;

import java.util.List;

/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:45:22
 */
public class Client {

	/**
	 * L'abre d'expression à générer par le parseur
	 */
	private List<AbstractExpression> expressionTree;
	
	/**
	 * Le contexte sur lequel évaluer les expressions
	 */
	private Context context;
	
	/**
	 * Le parseur utilisé pour la lecture du script
	 */
	private Parser parser;

	/**
	 * Constructeur prenant en compte le contexte sur lequel agir
	 * et le fichier à parser
	 * @param context
	 * @param file
	 */
	public Client(Context context, Parser parser){
		this.context = context;
		this.parser = parser;
		try {
			this.expressionTree = this.parser.parse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void reLoad(Parser p){
		this.parser = p;
		this.context.reset();
		try {
			this.expressionTree = this.parser.parse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Evalue les ModelExpressions de l'arbre d'expressions
	 */
	public void evaluate(){
		for(AbstractExpression e : this.expressionTree){
			e.interpret(this.context);
		}
	}
	
}