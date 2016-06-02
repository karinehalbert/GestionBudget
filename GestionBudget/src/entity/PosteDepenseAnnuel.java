package entity;

import java.util.Date;

/**
 * Poste de dépense fixe à verser une fois par an
 * 
 * @author Karine
 *
 */
public class PosteDepenseAnnuel extends PosteDepenseRecurrent {

	PosteDepenseAnnuel() {
		super();
	}

	PosteDepenseAnnuel(String nomPosteDepense) {
		super(nomPosteDepense);
	}

	PosteDepenseAnnuel(Date datePrevue, Double sommePrevue) {
		super(datePrevue, sommePrevue);
	}

	PosteDepenseAnnuel(String nomPosteDepense, Date datePrevue, Double sommePrevue) {
		super(nomPosteDepense, datePrevue, sommePrevue);
	}

}
