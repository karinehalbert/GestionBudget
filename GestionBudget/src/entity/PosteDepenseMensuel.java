package entity;

import java.util.Date;

/**
 * Poste de dépense fixe à régler une fois par mois
 * 
 * @author Karine
 *
 */
public class PosteDepenseMensuel extends PosteDepenseRecurrent {

	PosteDepenseMensuel() {
		super();
	}

	PosteDepenseMensuel(String nomPosteDepense) {
		super(nomPosteDepense);
	}

	PosteDepenseMensuel(Date datePrevue, Double sommePrevue) {
		super(datePrevue, sommePrevue);
	}

	PosteDepenseMensuel(String nomPosteDepense, Date datePrevue, Double sommePrevue) {
		super(nomPosteDepense, datePrevue, sommePrevue);
	}

}
