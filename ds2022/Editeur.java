package ds2022;

public class Editeur {
	long code;
	String nomEdit;
	String paysEdit;
	public Editeur(long code, String nomEdit, String paysEdit) {
		this.code = code;
		this.nomEdit = nomEdit;
		this.paysEdit = paysEdit;
		}
	@Override
	public String toString() {
		if (nomEdit.equalsIgnoreCase("Vivendi Universal"))
		{
			return("le code : "+this.code+" et son nom: "+this.nomEdit+" et son pzys est: "+this.paysEdit); 

		}
		return "";
	
	}
	
}