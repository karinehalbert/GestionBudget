package metier;

import java.util.List;

import entity.PosteDepenseAnnuel;

/**
 * Cette classe permet de faire des récapitulatifs des dépenses à venir pour l'utilisateur
 * Les dépenses prises en comptes seront seulement annuelles (une dépense fixe mensuelle est décomptée en début de chaque mois donc géré plus directement)
 * @author Karine
 *
 */
public class Echeancier {
	
	protected List<PosteDepenseAnnuel> listeEcheances;

}
