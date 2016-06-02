package entity;

import java.util.Date;

/**
 * Correspond à une seule dépense (réelle à pointer)
 * 
 * @author Karine
 *
 */
public class DepenseEffectuee {

	protected String nomDepense;
	protected Date dateDepense;
	protected boolean isPointed;

	DepenseEffectuee() {
		this.nomDepense = "";
		this.dateDepense = new Date();
		this.isPointed = false;
	}

	DepenseEffectuee(String nomDepense, Date dateDepense) {
		this.nomDepense = nomDepense;
		this.dateDepense = dateDepense;
		this.isPointed = false;
	}

	DepenseEffectuee(String nomDepense, Date dateDepense, boolean isPointed) {
		this.nomDepense = nomDepense;
		this.dateDepense = dateDepense;
		this.isPointed = isPointed;
	}

	public String getNomDepense() {
		return nomDepense;
	}

	public void setNomDepense(String nomDepense) {
		this.nomDepense = nomDepense;
	}

	public Date getDateDepense() {
		return dateDepense;
	}

	public void setDateDepense(Date dateDepense) {
		this.dateDepense = dateDepense;
	}

	public boolean isPointed() {
		return isPointed;
	}

	public void setPointed(boolean isPointed) {
		this.isPointed = isPointed;
	}

	@Override
	public String toString() {
		return "DepenseEffectuee [nomDepense=" + nomDepense + ", dateDepense=" + dateDepense + ", isPointed="
				+ isPointed + "]";
	}

}
