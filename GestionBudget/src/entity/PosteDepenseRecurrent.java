package entity;

import java.util.Date;

/**
 * Dépenses fixes (mensuelles ou annuelles) prévues
 * @author Karine
 *
 */
public abstract class PosteDepenseRecurrent extends PosteDepense {
	
	//On séparera l'annuel et le mensuel avec leur type (i.e. la fréquence dépendra du type)
	
	protected Date datePrevue;//si mensuel : mettre la prochaine date et on répercutera le même jour tous les mois
	//Date : date dd/MM, pas YYYY parce qu'un exercice financier est sur une année
	protected Double sommePrevue;

	PosteDepenseRecurrent() {
		super();
	}

	PosteDepenseRecurrent(String nomPosteDepense) {
		super(nomPosteDepense);
	}

	PosteDepenseRecurrent(Date datePrevue, Double sommePrevue) {
		super();
		this.datePrevue = datePrevue;
		this.sommePrevue = sommePrevue;
	}
	
	PosteDepenseRecurrent(String nomPosteDepense, Date datePrevue, Double sommePrevue) {
		super(nomPosteDepense);
		this.datePrevue = datePrevue;
		this.sommePrevue = sommePrevue;
	}

	public Date getDatePrevue() {
		return datePrevue;
	}

	public void setDatePrevue(Date datePrevue) {
		this.datePrevue = datePrevue;
	}

	public Double getSommePrevue() {
		return sommePrevue;
	}

	public void setSommePrevue(Double sommePrevue) {
		this.sommePrevue = sommePrevue;
	}

	@Override
	public String toString() {
		return "PosteDepenseRecurrent [datePrevue=" + datePrevue + ", sommePrevue=" + sommePrevue + "]";
	}
	
	

	
	

}
