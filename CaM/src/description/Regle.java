package description;

import java.util.ArrayList;

public class Regle {
	
	private ArrayList<Jeu> j;

	public Regle() {
	
		this.j=new ArrayList<>();
	}

	public ArrayList<Jeu> getJ() {
		return j;
	}

	

	@Override
	public String toString() {
		return "Regle [j=" + j + "]";
	}
	
	
	public void ajouter(Jeu jeu){
		
		this.j.add(jeu);
	}
	
	

}
