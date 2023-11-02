package ds2022;

public class Jeu {
	static int count=0;
	 long id;
	 String nomJeux;
	 int anneeSortie;
	 int nbTotalJeu;
	 int minAge;
	 private Editeur e;
	 public Jeu(Editeur e) {
		 this.e=e;
		 count++;
		 this.id=count;
	 }
	 public Jeu(Editeur edit, int ageMin, int annee, String nom) {
		 this(edit);
		 this.minAge=ageMin;
		 this.nomJeux=nom;
		 this.anneeSortie=annee;
		 
	 }
	 public Editeur getE() {
		 return this.e;
	 }
	 public void setE(Editeur e) {
		 this.e=e;
	 }
	 
	 void decrire() {
		 System.out.println("[Jeu id="+this.id+" name= "+this.nomJeux+" Année d'edition= "+this.anneeSortie+" Age minimum= "+this.minAge+" Editeur "+this.e);
	 }
	 
	
}
