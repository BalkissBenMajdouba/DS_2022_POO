package ds2022;

public class JeuMultiple extends Jeu{
	private int nbJoueur;
	public JeuMultiple(Editeur edit, int ageMin, int annee, String nom,int nbJoueur) {
		super(edit, ageMin, annee, nom);
		 this.nbJoueur=nbJoueur;
	}
	@Override 
	public void decrire() {
		
				System.out.println(super.toString()+" le nb joueur est :"+ this.nbJoueur);
	}
	public int getNbJoueur() {
		return nbJoueur;
	}

}
