package entity;

public class PosteDepensePonctuel extends PosteDepense {

	/**
	 * Catégorie de dépenses qui se répètent régulièrement sans être prévues à
	 * date fixe (courses, vêtements, etc.)
	 */
	PosteDepensePonctuel() {
		super();
	}

	PosteDepensePonctuel(String nomPosteDepense) {
		super(nomPosteDepense);
	}

}
