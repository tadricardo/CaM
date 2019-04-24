package description;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Monstre {
	private final String nom;
	//private Scanner sc;
	private static ArrayList<Bords> caseVisiteParLeMonstre;
	private int numeroDuTour = 1;
	private int pos_X;
	private int pos_Y;
	private Random choix;
	private  Regle r;
	private Jeu j;

	// private Plateau p;

	public Monstre(String nom) {

		this.nom = nom;
		choix = new Random();
		caseVisiteParLeMonstre = new ArrayList<>();

		this.j = new Jeu(new Bords(getPos_X(),getPos_Y()),getNumeroDeTour(),true);
		 this.r =new Regle();

	}

	public String getNomMonstre() {

		return this.nom;
	}

	public void positionDuMonstre() {
		pos_X = choix.nextInt(Plateau.getTaille());
		pos_Y = choix.nextInt(Plateau.getTaille());
		modifBox();
		j.setB(new Bords(pos_X, pos_Y));
		j.setNumTour(numeroDuTour);
		j.setEtat(modifBox());
		r.ajouter(new Jeu(j.getB(),j.getNumTour(),j.getEtat()));
	caseVisiteParLeMonstre.add(new Bords(pos_X, pos_Y));
		numeroDuTour++;

	}

	public int getNumeroDeTour() {

		return numeroDuTour;
	}

	public static ArrayList<Bords> getCaseVisiteParLeMonstre() {

		return caseVisiteParLeMonstre;
	}

	public int getPos_X() {

		return pos_X;
	}

	public int getPos_Y() {

		return pos_Y;
	}

	public void nord() {
		
		if(moveNord()==true)
			System.out.println("impo");
		else{
		
		if(Plateau.getPlateau()[pos_X-1][pos_Y]==false){
			pos_X=pos_X - 1;
			modifBox();
			caseVisiteParLeMonstre.add(new Bords(pos_X, pos_Y));
			j.setB(new Bords(pos_X, pos_Y));
			j.setNumTour(numeroDuTour);
			j.setEtat(modifBox());
			r.ajouter(new Jeu(j.getB(),j.getNumTour(),j.getEtat()));
			numeroDuTour++;
		}
		 else{
			 
			 
			  System.out.println("Impossible");
		  }
		}

	}
	
	 public void sud(){
		 
	 
	  if(Plateau.getPlateau()[pos_X+1][pos_Y]==false){
		  pos_X=pos_X + 1;
		     modifBox();
			caseVisiteParLeMonstre.add(new Bords(pos_X, pos_Y));
			
			j.setB(new Bords(pos_X, pos_Y));
			j.setNumTour(numeroDuTour);
			j.setEtat(modifBox());
			r.ajouter(new Jeu(j.getB(),j.getNumTour(),j.getEtat()));
			
			numeroDuTour++;
		}
	  else{
		  System.out.println("Impossible");
	  
	  
	 } 
	  } public void est(){
	
	 
	  if(Plateau.getPlateau()[pos_X][pos_Y+1]==false){
		  pos_Y=pos_Y+1;
		 modifBox();
			caseVisiteParLeMonstre.add(new Bords(pos_X, pos_Y));
		
			j.setB(new Bords(pos_X, pos_Y));
			j.setNumTour(numeroDuTour);
			j.setEtat(modifBox());
			r.ajouter(new Jeu(j.getB(),j.getNumTour(),j.getEtat()));
			numeroDuTour++;
		}
	  else{
		  System.out.println("Impossible");
	  }
	  
	  } public void ouest(){
	  
		  
	  
	  if(Plateau.getPlateau()[pos_X][pos_Y-1]==false){
		  pos_Y=pos_Y-1;
		   modifBox();
			caseVisiteParLeMonstre.add(new Bords(pos_X, pos_Y));
			j.setB(new Bords(pos_X, pos_Y));
			j.setNumTour(numeroDuTour);
			j.setEtat(modifBox());
			r.ajouter(new Jeu(j.getB(),j.getNumTour(),j.getEtat()));
			numeroDuTour++;
		}
	  else{
		  System.out.println("Impossible");
	  }
	  
	 
	  } 

	
	public boolean modifBox(){
		
		return  Plateau.getPlateau()[pos_X][pos_Y]=true; 
	}
	
	public Regle getR(){
		return r;
	}
   public boolean moveNord(){
	   boolean res=false;
		Bords b =new Bords(pos_X-1,pos_Y);
		for(int i=0;i <Plateau.bordEnHaut().size();i++){
              res=Plateau.bordEnHaut().get(i).equals(b);
		}
    	  return res;
	}

}
