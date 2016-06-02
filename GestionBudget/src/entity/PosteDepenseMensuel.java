package entity;

import java.util.Date;

/**
 * Poste de dépense fixe à régler une fois par mois
 * @author Karine
 *
 */
public class PosteDepenseMensuel extends PosteDepenseRecurrent {

	public PosteDepenseMensuel() {
		super();
	}

	public PosteDepenseMensuel(String nomPosteDepense) {
		super(nomPosteDepense);
	}

	public PosteDepenseMensuel(Date datePrevue, Double sommePrevue) {
		super(datePrevue, sommePrevue);
	}

	public PosteDepenseMensuel(String nomPosteDepense, Date datePrevue, Double sommePrevue) {
		super(nomPosteDepense, datePrevue, sommePrevue);
	}
	
	

}
