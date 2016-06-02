package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Liste de dépenses
 * @author Karine
 *
 */
public abstract class PosteDepense {
	
	protected String nomPosteDepense;
	protected List<DepenseEffectuee> listeDepenses;
	
	public PosteDepense() {
		this.listeDepenses = new ArrayList<DepenseEffectuee>();
	}

	public PosteDepense(String nomPosteDepense) {
		this.nomPosteDepense = nomPosteDepense;
		this.listeDepenses = new ArrayList<DepenseEffectuee>();
	}
	
	//Dans PDService
	public void addDepense(DepenseEffectuee d){
		listeDepenses.add(d);
	}
	
	


}
