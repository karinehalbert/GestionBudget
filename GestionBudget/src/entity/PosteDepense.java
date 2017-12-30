package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Liste de dépenses correspondant à une catégorie
 * 
 * @author Karine
 *
 */
public abstract class PosteDepense {

	protected String nomPosteDepense;
	protected List<DepenseEffectuee> listeDepenses;

	PosteDepense() {
		this.listeDepenses = new ArrayList<DepenseEffectuee>();
	}

	PosteDepense(String nomPosteDepense) {
		this.nomPosteDepense = nomPosteDepense;
		this.listeDepenses = new ArrayList<DepenseEffectuee>();
	}

	public void addDepense(DepenseEffectuee d) {
		listeDepenses.add(d);
	}

	public String getNomPosteDepense() {
		return nomPosteDepense;
	}

	public void setNomPosteDepense(String nomPosteDepense) {
		this.nomPosteDepense = nomPosteDepense;
	}

	public List<DepenseEffectuee> getListeDepenses() {
		return listeDepenses;
	}

	public void setListeDepenses(List<DepenseEffectuee> listeDepenses) {
		this.listeDepenses = listeDepenses;
	}

	@Override
	public String toString() {
		return "PosteDepense [nomPosteDepense=" + nomPosteDepense + ", listeDepenses=" + listeDepenses + "]";
	}

}
