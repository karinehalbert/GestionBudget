package entity;

import java.util.Date;

/**
 * Correspond à une seule dépense (réelle à pointer)
 * 
 * @author Karine
 *
 */
public class DepenseEffectuee {

	private String nomDepense;
	private Date dateDepense;
	private Double sommeDepense;
	private boolean isPointed;

	DepenseEffectuee() {
		this.nomDepense = "";
		this.dateDepense = new Date();
		this.sommeDepense = 0.0;
		this.isPointed = false;
	}

	DepenseEffectuee(String nomDepense, Date dateDepense, Double sommeDepense) {
		this.nomDepense = nomDepense;
		this.dateDepense = dateDepense;
		this.sommeDepense = sommeDepense;
		this.isPointed = false;
	}

	DepenseEffectuee(String nomDepense, Date dateDepense, Double sommeDepense, boolean isPointed) {
		this.nomDepense = nomDepense;
		this.dateDepense = dateDepense;
		this.sommeDepense = sommeDepense;
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

	public Double getSommeDepense() {
		return sommeDepense;
	}

	public void setSommeDepense(Double sommeDepense) {
		this.sommeDepense = sommeDepense;
	}

	public boolean isPointed() {
		return isPointed;
	}

	public void setPointed(boolean isPointed) {
		this.isPointed = isPointed;
	}

	@Override
	public String toString() {
		return "DepenseEffectuee [nomDepense=" + nomDepense + ", dateDepense=" + dateDepense + ", sommeDepense="
				+ sommeDepense + ", isPointed=" + isPointed + "]";
	}

}
