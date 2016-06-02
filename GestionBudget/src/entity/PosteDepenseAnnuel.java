package entity;

import java.util.Date;

/**
 * Poste de dépense fixe à verser une fois par an
 * @author Karine
 *
 */
public class PosteDepenseAnnuel extends PosteDepenseRecurrent {

	public PosteDepenseAnnuel() {
		super();
	}

	public PosteDepenseAnnuel(String nomPosteDepense) {
		super(nomPosteDepense);
	}

	public PosteDepenseAnnuel(Date datePrevue, Double sommePrevue) {
		super(datePrevue, sommePrevue);
	}

	public PosteDepenseAnnuel(String nomPosteDepense, Date datePrevue, Double sommePrevue) {
		super(nomPosteDepense, datePrevue, sommePrevue);
	}
	
	
	
	

}
