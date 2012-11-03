package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 * @author Administrateur
 * @version 1.0
 * @created 20-oct.-2012 14:32:55
 */
public class Model {

	/**
	 * Les variables du modèle référencées avec leur nom
	 */
	private Map<String, Variable> variables;
	
	/**
	 * Les pictures du modèle référencées avec leur nom
	 */
	private Map<String, Picture> pictures;

	public Model(){
		this.variables = new HashMap<String, Variable>();
		this.pictures = new HashMap<String, Picture>();
	}
	
	/**
	 * Constructeur par recopie non profonde (références)
	 * @param m
	 */
	public Model(Model m){
		this();
		for(Variable v : m.getListVariables()){
			this.putVariable(v);
		}
		for(Picture p : m.getListPictures()){
			this.putPicture(p);
		}
	}

	/**
	 * @return Les variables du modèle sous forme de Map
	 */
	public Map<String, Variable> getVariables() {
		return variables;
	}
	
	/**
	 * @return Les variables du modèle sous forme de Liste
	 */
	public List<Variable> getListVariables(){
		return new ArrayList<Variable>(this.variables.values());
	}

	
	/**
	 * @return Les pictures du modèle sous forme de Map
	 */
	public Map<String, Picture> getPictures() {
		return pictures;
	}
	
	/**
	 * @return Les pictures du modèle sous forme de Liste
	 */
	public List<Picture> getListPictures(){
		return new ArrayList<Picture>(this.pictures.values());
	}
	
	/**
	 * @param name
	 * @return La variable dont le nom est name
	 */
	public Variable getVariable(String name){
		return this.variables.get(name);
	}
	
	/**
	 * @param name
	 * @return La picture dont le nom est name
	 */
	public Picture getPicture(String name){
		return this.pictures.get(name);
	}
	
	/**
	 * Ajoute une variable au modele si elle n'y est pas présente,
	 * la met à jour sinon
	 * @param var
	 */
	public void putVariable(Variable var){
		this.variables.put(var.getName(), var);
	}
	
	/**
	 * Ajoute une liste de variables au modele
	 * @param var
	 */
	public void putAllVariables(List<Variable> vars){
		for(Variable var : vars){
			this.variables.put(var.getName(), var);
		}	
	}
	
	/**
	 * Ajoute une picture au modele si elle n'y est pas présente,
	 * la met à jour sinon
	 * @param var
	 */
	public void putPicture(Picture pic){
		this.pictures.put(pic.getName(), pic);
	}
	
	/**
	 * Ajoute une liste de pictures au modele
	 * @param var
	 */
	public void putPictures(List<Picture> pics){
		for(Picture pic : pics){
			this.pictures.put(pic.getName(), pic);
		}	
	}
	
	public void reset(){
		this.variables = new HashMap<String, Variable>();
		this.pictures = new HashMap<String, Picture>();
	}

}