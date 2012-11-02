package interpretation.parsing;

import interpretation.expressions.AbstractExpression;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;

public class SimpleParser implements Parser{

	private String script;
	
	public SimpleParser(){
	}
	
	public List<AbstractExpression> parse(String file) throws Exception {
		List<AbstractExpression> retour = new ArrayList<AbstractExpression>();
		
		InputStream stream = new FileInputStream(file);
		this.script = IOUtils.toString(stream).trim();
		
		while(!(this.script.isEmpty())){
			retour.add(this.nextInstruction());
		}
		
		return retour;
	}

	/**
	 * 
	 * @param script
	 * @return L'expression correspondant à la première instruction du
	 * script, supprime le texte correspondant à celle-ci
	 * dans le String
	 */
	private AbstractExpression nextInstruction(){
		
		AbstractExpression retour = null;
		
		// On charge le script et récupere la première ligne
		Scanner sc = new Scanner(this.script);
		String line = sc.nextLine();
		
		// On coupe tous les mots séparés par un espace
		String[] split = line.split("\\s");
		
		// CAS 1 : DECLARATION DE PICTURE OU DE VARIABLE
		if(split.length == 2){
			String name = getFunctionName(split[1]);
			List<String> params = getFunctionParameters(split[1]);
			params.add(0, name);
			retour = Sentence.getExpression(split[0], params);
		}
		else
		if(split.length == 1){
	
			// CAS 2 : INSTRUCTION SUR UNE SEULE LIGNE
			String syntax = getFunctionName(split[0]);
			if(Sentence.isSingleLineInstruction(syntax)){
				retour = Sentence.getExpression(syntax,
						getFunctionParameters(split[0]));
			}
			
			// CAS 3 : STRUCTURE DE CONTROLE OU BOUCLE
			else{
				
			}
		}
		
		// On supprime du script ce qui a déjà été parsé
		this.script = "";
		while(sc.hasNextLine()){
			this.script += sc.nextLine();
			if(sc.hasNextLine()){
				this.script += "\n";
			}
		}
		return retour;
	}
	
	/**
	 * @param s (de la forme " name(...)")
	 * @return le nom d'une fonction ou d'un constructeur 
	 */
	private static String getFunctionName(String s){
		return s.split("[(].*[)]")[0];
	}
	
	/**
	 * @param s (de la forme " name(p1,p2,...)")
	 * @return l'ensemble des paramètres d'une fonction sous forme de liste
	 */
	private static List<String> getFunctionParameters(String s){
		
		// On récupere le contenu des parenthèses
		Pattern p = Pattern.compile("[(](.*)[)]");
		Matcher m = p.matcher(s);
		String retour = "";
		if(m.find()){
			retour = m.group();
		}
		retour = retour.substring(1);
		retour = retour.substring(0, retour.length()-1);
		
		// On stocke les paramètres
		List<String> params = new ArrayList<String>();
		Scanner sc = new Scanner(retour).useDelimiter("\\s*,");
		while(sc.hasNext()){
			params.add(sc.next());
		}
		
		return params;
	}
	
	public static void main(String[] args){
	}	
}
