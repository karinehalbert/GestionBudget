package entity;

import java.util.Date;

public class Factory {

	// Classes abstraites => pas de constructeur

	// DepenseEffectuee
	public DepenseEffectuee createDepenseEffectuee() {
		return new DepenseEffectuee();
	}

	public DepenseEffectuee createDepenseEffectuee(String nomDepense, Date dateDepense, Double sommeDepense) {
		return new DepenseEffectuee(nomDepense, dateDepense, sommeDepense);
	}

	public DepenseEffectuee createDepenseEffectuee(String nomDepense, Date dateDepense, Double sommeDepense,
			boolean isPointed) {
		return new DepenseEffectuee(nomDepense, dateDepense, sommeDepense, isPointed);
	}

	// PosteDepenseAnnuel
	public PosteDepenseAnnuel createPosteDepenseAnnuel() {
		return new PosteDepenseAnnuel();
	}

	public PosteDepenseAnnuel createPosteDepenseAnnuel(String nomPosteDepense) {
		return new PosteDepenseAnnuel(nomPosteDepense);
	}

	public PosteDepenseAnnuel createPosteDepenseAnnuel(Date datePrevue, Double sommePrevue) {
		return new PosteDepenseAnnuel(datePrevue, sommePrevue);
	}

	public PosteDepenseAnnuel createPosteDepenseAnnuel(String nomPosteDepense, Date datePrevue, Double sommePrevue) {
		return new PosteDepenseAnnuel(nomPosteDepense, datePrevue, sommePrevue);
	}

	// PosteDepenseMensuel
	public PosteDepenseMensuel createPosteDepenseMensuel() {
		return new PosteDepenseMensuel();
	}

	public PosteDepenseMensuel createPosteDepenseMensuel(String nomPosteDepense) {
		return new PosteDepenseMensuel(nomPosteDepense);
	}

	public PosteDepenseMensuel createPosteDepenseMensuel(Date datePrevue, Double sommePrevue) {
		return new PosteDepenseMensuel(datePrevue, sommePrevue);
	}

	public PosteDepenseMensuel createPosteDepenseMensuel(String nomPosteDepense, Date datePrevue, Double sommePrevue) {
		return new PosteDepenseMensuel(nomPosteDepense, datePrevue, sommePrevue);
	}

	// PosteDepensePonctuel
	public PosteDepensePonctuel createPosteDepensePonctuel() {
		return new PosteDepensePonctuel();
	}

	public PosteDepensePonctuel createPosteDepensePonctuel(String nomPosteDepense) {
		return new PosteDepensePonctuel(nomPosteDepense);
	}

	// PosteDepenseEconomie
	public PosteDepenseEconomie createPosteDepenseEconomie() {
		return new PosteDepenseEconomie();
	}

	public PosteDepenseEconomie createPosteDepenseEconomie(String nomPosteDepense) {
		return new PosteDepenseEconomie(nomPosteDepense);
	}

	// Dépenses du mois
	public MonthExpenses createMonthExpenses() {
		return new MonthExpenses();
	}

	public MonthExpenses createMonthExpenses(int numMonth) {
		return new MonthExpenses(numMonth);
	}

}
