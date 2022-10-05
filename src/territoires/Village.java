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
								+ "est à la recherhche d'un autre village" );
		}	
	}
	public void trouverHabitant(int numVillageois) {
		System.out.println("Je recherche" 
							+ villageois[numVillageois]
							+ "Où est il ?");
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		 this.chef = chef;
	 }
	
	public static void main(String args[]) {
		Village village = new Village("Village des Irréductible", 30);
		// Gaulois gaulois = village.trouverHabitant(30); 
		// 
		//
		Chef chef = new chef (Abraracourcix, 6)
		
		
	}
 }