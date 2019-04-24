package description;

import java.util.ArrayList;

public class Plateau {
	// Attributs de la classe

	protected static boolean[][] plateau;
	private static ArrayList<Bords> bordEnHaut;
	private static ArrayList<Bords> bordEnBas;
	private static ArrayList<Bords> bordAGauche;
	private static ArrayList<Bords> bordADroite;
	private static int taille;
	private boolean visite = false;
	// private int init = 0;

	/**
	 * Le construction de la classe qui prends en paramétre la taille du plateau
	 * à 2D
	 * 
	 * @param taille
	 */

	public Plateau(int taille) {

		Plateau.taille = taille;
		plateau = new boolean[taille][taille];
		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {

				plateau[i][j] = visite;

			}

		}

	}

	/**
	 * 
	 * Renvoie la taille de plateau;
	 */

	public static int getTaille() {

		return taille;
	}

	/**
	 * Affichage du plateau
	 */
	public void affichagePlateau() {

		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {

				System.out.print("|" + plateau[i][j]);
			}
			System.out.println("|");

		}

	}

	/**
	 * 
	 * @return la liste des bords en haut (le nord) du plateau
	 * 
	 */
	public static ArrayList<Bords> bordEnHaut() {
		bordEnHaut = new ArrayList<>();

		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {

				if (i == 0 && (j == 0 || j != 0))
					bordEnHaut.add(new Bords(i, j));
			}

		}
		return bordEnHaut;

	}

	/**
	 * 
	 * @return la liste des bords en bas (vers le sud) du plateau
	 * 
	 */
	public static ArrayList<Bords> bordEnBas() {
		bordEnBas = new ArrayList<>();

		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {

				if (i == taille - 1 && (j == 0 || j != 0))
					bordEnBas.add(new Bords(i, j));
			}

		}
		return bordEnBas;

	}

	/**
	 * 
	 * @return la liste des bords à droite (vers l'Est) du plateau
	 * 
	 */
	public static ArrayList<Bords> bordADroite() {
		bordADroite = new ArrayList<>();

		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {

				if (i != 0 && i != taille - 1 && j == 0)
					bordADroite.add(new Bords(i, j));
			}

		}
		return bordADroite;

	}

	/**
	 * 
	 * @return la liste des bords à gauche (vers l'ouest ) du plateau
	 * 
	 */
	public static ArrayList<Bords> bordAGauche() {
		bordAGauche = new ArrayList<>();

		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau.length; j++) {

				if (i != 0 && i != taille - 1 && j == taille - 1)
					bordAGauche.add(new Bords(i, j));
			}

		}
		return bordAGauche;

	}

	/**
	 * test
	 */
	public void affichageBord() {

		for (int index = 0; index < bordAGauche().size(); index++) {
			System.out.println(bordAGauche().get(index));
		}
	}

	/**
	 * Renvoie le plateau
	 * 
	 * @return plateau
	 */
	public static boolean[][] getPlateau() {

		return plateau;
	}
	


	/**
	 * Renvoie un boolean
	 * 
	 * @return true or false (visite)
	 */
	public boolean getVisite() {

		return visite;

	}
	public void setVisite(boolean v){
		 this.visite=v;
		
	}
}
