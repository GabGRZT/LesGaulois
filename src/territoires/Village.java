package territoires;

import personnages.*;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois [] villageois;
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = villageois;
	}
	
	public void ajouterHabitant (Gaulois gaulois, int nbVillageoisMaximum) {
		if (nbVillageois < nbVillageoisMaximum) {
			villageois[nbVillageois] = gaulois;
			nbVillageois += 1;
		} else {
			System.out.println("Il n'y a plus de place" 
								+ gaulois.getNom() 
								+ "est � la recherhche d'un autre village" );
		}	
	}
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
							
	}
	
	public afficherVillageois
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		 this.chef = chef;
	 }
	
	public static void main(String args[]) {
		Village village = new Village("Village des Irr�ductible", 30);
		// Gaulois gaulois = village.trouverHabitant(30); 
		// On ne peut pas atteindre la valeur 30 dans le tableau
		// puisque ces indices vont de 0 � 29
		Chef chef = new Chef("Abraracourix", 6, 1, village);
		Gaulois asterix = new Gaulois("Asterix", 6);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		Le tableau est vide pour l'instant donc �a retourne NULL
		
		
	}
 }