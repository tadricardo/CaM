package test;

import java.util.Scanner;

import description.Bords;
import description.Jeu;
import description.Monstre;
import description.Plateau;
import description.Regle;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		Monstre m1 = new Monstre("TAD");
		Plateau p1 = new Plateau(5);
		Jeu j = new Jeu(new Bords(m1.getPos_X(),m1.getPos_Y()),m1.getNumeroDeTour(),true);
		
		Regle r =new Regle();
		r.ajouter(j);
		int choix,i=0;
		
		 
		System.out.println();
		 
		
		
		m1.positionDuMonstre();
		 p1.affichagePlateau();
	
		 while(i<3){
			 System.out.println("--------------------------------");
			 System.out.print("voitre choix:" ); choix=sc.nextInt(); 
			 System.out.println("--------------------------------");
			
		 
		switch(choix){
		case 1:m1.nord();p1.affichagePlateau(); break;
		case 2:m1.sud();p1.affichagePlateau(); break;
		case 3:m1.est(); p1.affichagePlateau();break;
		case 4:m1.ouest();p1.affichagePlateau(); break;
		default: System.out.println("faite un choix entre 1 et 4"); break;
		
		}
		i++;
		 }
		 
		 System.out.print(m1.getR());

	}

}
