package entity;

import java.util.Date;

/**
 * D�penses fixes (mensuelles ou annuelles) pr�vues
 * @author Karine
 *
 */
public abstract class PosteDepenseRecurrent extends PosteDepense {
	
	//On s�parera l'annuel et le mensuel avec leur type (i.e. la fr�quence d�pendra du type)
	
	protected Date datePrevue;//si mensuel : mettre la prochaine date et on r�percutera le m�me jour tous les mois
	//Date : date dd/MM, pas YYYY parce qu'un exercice financier est sur une ann�e
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
