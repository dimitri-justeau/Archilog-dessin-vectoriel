package rendering;

import model.Model;



/**
 * @author Andres Felipe Gutierrez, Amaury Ollagnier et Dimitri Justeau
 * @version 1.0
 * @created 20-oct.-2012 14:33:14
 */
public abstract class Visitor implements IVisitor {

	/**
	 * La variable modele, qui contient toutes les
	 * instanciations de la modelisation java
	 */
	private Model model;

	public Visitor(){

	}

	/**
	 * Methode permettant de visiter les differents
	 * elements du modele, et d'effectuer des 
	 * appels a une factory dans le but de creer les objets
	 * correspondant pour le rendering
	 * @void 
	 */
	public abstract void visitModel();
	
	/**
	 * Methode pour effectuer le renderer
	 * ou l'affichage du dessin avec le visiteur souhaité
	 */
	public abstract void render();

	/**
	 * @return the model
	 */
	public Model getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(Model model) {
		this.model = model;
	}

}