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

	public PosteDepenseRecurrent() {
		super();
	}

	public PosteDepenseRecurrent(String nomPosteDepense) {
		super(nomPosteDepense);
	}

	public PosteDepenseRecurrent(Date datePrevue, Double sommePrevue) {
		super();
		this.datePrevue = datePrevue;
		this.sommePrevue = sommePrevue;
	}
	
	public PosteDepenseRecurrent(String nomPosteDepense, Date datePrevue, Double sommePrevue) {
		super(nomPosteDepense);
		this.datePrevue = datePrevue;
		this.sommePrevue = sommePrevue;
	}
	

	
	

}
