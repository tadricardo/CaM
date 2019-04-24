package description;

public class Jeu {
	
   private Bords b;
   private int numTour;
   private boolean etat;
   
   public Jeu(Bords b, int numTour, boolean etat){
	   
	   this.b=b;
	   this.numTour=numTour;
	   this.etat=etat;
   }

public Bords getB() {
	return b;
}

public int getNumTour() {
	return numTour;
}

public boolean getEtat() {
	return etat;
}

public void setB(Bords b) {
	this.b = b;
}

public void setNumTour(int numTour) {
	this.numTour = numTour;
}

public void setEtat(boolean etat) {
	this.etat = etat;
}

@Override
public String toString() {
	return "Jeu [b=" + b + ", numTour=" + numTour + ", etat=" + etat + "]";
}




}
