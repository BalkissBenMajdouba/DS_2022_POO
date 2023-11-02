
package ds2022;

public class JeuPrincipal {
	public static void main(String[] args) {
		Editeur Ed1= new Editeur(123, "Ubisoft", "Canada");
		Editeur Ed2= new Editeur(133, "Vivendi Universal", "France");
		System.out.println(Ed1);
		System.out.println(Ed2);
		
		Jeu[] TabJ = new Jeu [3];
		Jeu J1=new Jeu (Ed1,  6, 2020,"Watch dogs");
		Jeu J2=new Jeu (Ed2,  12, 2019,"WoW");
		Jeu J3=new JeuMultiple (Ed2, 6,  2020,"WoW",2);
		TabJ[0]=J1;
		TabJ[1]=J2;
		TabJ[2]=J3;
		System.out.println("**");
		for(int i =0;i<TabJ.length;i++) {
			
			if(TabJ[i] instanceof JeuMultiple) {
				
				System.out.println(((JeuMultiple)TabJ[i]).getNbJoueur());
			}
		}
		
	}

} 
