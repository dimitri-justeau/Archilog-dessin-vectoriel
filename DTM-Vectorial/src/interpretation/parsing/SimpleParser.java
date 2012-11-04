package interpretation.parsing;

import interpretation.expressions.AbstractExpression;
import interpretation.expressions.math.ENumber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleParser implements Parser{

	/**
	 * Le script à parser
	 */
	private String script;
	
	public SimpleParser(File file){
		Scanner sc;
		try {
			sc = new Scanner(file).useDelimiter("\\A");
			this.script = sc.hasNext()? sc.next() : "";
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public SimpleParser(String script){
		this.script = script;
	}
	
	public List<AbstractExpression> parse() throws Exception {
		List<AbstractExpression> retour = new ArrayList<AbstractExpression>();
		
		while(!(this.script.isEmpty())){
			AbstractExpression next = this.nextInstruction();
			if(next != null){
				retour.add(next);
			}	
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
	private AbstractExpression nextInstruction() throws Exception{
		
		AbstractExpression retour = null;
		
		// On charge le script et récupere la première ligne
		Scanner sc = new Scanner(this.script);
		String line = "";
		do{
			line = sc.nextLine().trim();
		}while(line.isEmpty() && sc.hasNextLine());

		// CAS 0 : DECLARATION OU MODIFICATION DE NOMBRE
		String[] split = line.split("=");
		if(split.length == 2){
			String name = split[0].trim();
			String expression = split[1].trim();
			retour = new ENumber(name, expression);
		}
		
		// SYNTAXE CORRESPONDANT A UNE EXPRESSION
		else{
			// On coupe tous les mots séparés par un espace
			split = line.split("\\s");
		
			// CAS 1 : DECLARATION DE PICTURE OU DE VARIABLE
			if(split.length == 2){
				String name = getFunctionName(split[1]);
				List<Object> params = getFunctionParameters(split[1]);
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
					// CAS 3-1 : STRUCTURE A UN SEUL BLOC
					if(Sentence.isSingleBlocStructure(syntax)){
						List<Object> params = new ArrayList<Object>();
						params.addAll(getFunctionParameters(split[0]));
						
						// On récupère le contenu du bloc
						sc.useDelimiter("[}]");
						String bloc = sc.next();
						SimpleParser sp = new SimpleParser(bloc);
						params.addAll(sp.parse());
						retour = Sentence.getExpression(syntax, params);
						
						sc.nextLine();
					}
					
					// CAS 3-2 : STRUCTURE A PLUSIEURS BLOCS
					else{
						// CAS 3-3 : STRUCTURE A DEUX BLOCS
						List<Object> params = new ArrayList<Object>();
						params.addAll(getFunctionParameters(split[0]));
						// On récupère le contenu du bloc
						sc.useDelimiter("[}]");
						String bloc1 = sc.next();

						SimpleParser sp1 = new SimpleParser(bloc1);
						List<AbstractExpression> l1 = sp1.parse();
		
						sc.nextLine();
						sc.nextLine();

						sc.useDelimiter("[}]");
						String bloc2 = sc.next();
						SimpleParser sp2 = new SimpleParser(bloc2);
						List<AbstractExpression> l2 = sp2.parse();
						
						params.add(l1);
						params.add(l2);

						retour = Sentence.getExpression(syntax, params);
						
						sc.nextLine();
					}
				}
			}
		}
		
		// On supprime du script ce qui a déjà été parsé
		this.script = sc.hasNext()? sc.useDelimiter("\\A").next() : "";
		sc.close();
		return retour;
	}
	
	/**
	 * @param s (de la forme " name(...)")
	 * @return le nom d'une fonction ou d'un constructeur 
	 */
	private static String getFunctionName(String s){
		return s.split("[(].*[)]")[0].trim();
	}
	
	/**
	 * @param s (de la forme " name(p1,p2,...)")
	 * @return l'ensemble des paramètres d'une fonction sous forme de liste
	 */
	private static List<Object> getFunctionParameters(String s){
		
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
		List<Object> params = new ArrayList<Object>();
		Scanner sc = new Scanner(retour);
		sc.useDelimiter(",");
		while(sc.hasNext()){
			String par = sc.next().trim();
			params.add(par);
		}
		sc.close();
		return params;
	}
	
	public static void main(String[] args){
	}	
}
