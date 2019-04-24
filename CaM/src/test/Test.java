package test;

import java.util.Scanner;

import description.Bords;
import description.Monstre;
import description.Plateau;

public class Test {

	public static void main(String[] args) {
		int choix,i=0;
		 Monstre m=new Monstre("kkk");
		Scanner sc =new Scanner(System.in);
		Plateau p = new Plateau(5);
		 Bords b  = new Bords(2,2);
		
		m.positionDuMonstre();
		System.out.println("--------------------------------");
	
		System.out.println("--------------------------------");
	System.out.println(Monstre.getCaseVisiteParLeMonstre());
		System.out.println("--------------------------------");
		
	    //System.out.println("le numero du tour est:"+tour.getNumeroDeTour());
		
		p.affichagePlateau();
		System.out.println("--------------------------------");
		 System.out.println("voitre choix:");
		 while(i<5){
		 choix=sc.nextInt();
		switch(choix){
		case 1:m.nord();p.affichagePlateau(); break;
		case 2:m.sud();p.affichagePlateau(); break;
		case 3:m.est(); p.affichagePlateau();break;
		case 4:m.ouest();p.affichagePlateau(); break;
		default: System.out.println("faite un choix entre 1 et 4"); break;
		
		}
		i++;
		 }
		//System.out.println(Monstre.getCaseVisiteParLeMonstre());
		
		//System.out.println(Monstre.getCaseVisiteParLeMonstre().contains(b));
		//p.affichageBord();
		
		//System.out.println(p.getTaille());
	}

}
