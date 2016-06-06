package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Dédié au stockage des transactions réelles pendant un mois (fiche de compte
 * mensuelle)
 * 
 * @author Karine
 *
 */
public class MonthExpenses {

	private int numMonth; // Numéro du mois dans le calendrier
	private List<DepenseEffectuee> listDepensesMois; // Liste des dépenses
														// effectuées dans le
														// mois

	MonthExpenses() {
		this.numMonth = 0;
		this.listDepensesMois = new ArrayList<DepenseEffectuee>();
	}

	MonthExpenses(int numMonth) {
		this.numMonth = numMonth;
		this.listDepensesMois = new ArrayList<DepenseEffectuee>();
	}

	public void addDepense(DepenseEffectuee depense) {
		this.listDepensesMois.add(depense);
	}

	/**
	 * Renvoie le nom du mois correspondant à son numéro
	 * 
	 * @return le nom du mois
	 */
	public String getNameMonth() {
		String name;
		switch (this.numMonth) {
		case 1:
			name = "Janvier";
			break;
		case 2:
			name = "Février";
			break;
		case 3:
			name = "Mars";
			break;
		case 4:
			name = "Avril";
			break;
		case 5:
			name = "Mai";
			break;
		case 6:
			name = "Juin";
			break;
		case 7:
			name = "Juillet";
			break;
		case 8:
			name = "Août";
			break;
		case 9:
			name = "Septembre";
			break;
		case 10:
			name = "Octobre";
			break;
		case 11:
			name = "Novembre";
			break;
		case 12:
			name = "Décembre";
			break;
		default:
			name = "";
			break;
		}
		return name;
	}

	public int getNumMonth() {
		return numMonth;
	}

	public void setNumMonth(int numMonth) {
		this.numMonth = numMonth;
	}

	public List<DepenseEffectuee> getListDepensesMois() {
		return listDepensesMois;
	}

	public void setListDepensesMois(List<DepenseEffectuee> listDepensesMois) {
		this.listDepensesMois = listDepensesMois;
	}

	@Override
	public String toString() {
		return "MonthExpenses [numMonth=" + numMonth + ", listDepensesMois=" + listDepensesMois + "]";
	}

}
