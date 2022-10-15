package territoires;

import personnages.*;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois [] villageois;
<<<<<<< HEAD
	private  int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		 this.chef = chef;
	}
	
	public void ajouterHabitant (Gaulois gaulois, int nbVillageoisMax) {
		if (nbVillageois < nbVillageoisMax) {
=======
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = villageois;
	}
	
	public void ajouterHabitant (Gaulois gaulois, int nbVillageoisMaximum) {
		if (nbVillageois < nbVillageoisMaximum) {
>>>>>>> fde8fb16f0b5bfdd2a9a8426eb78118a22340660
			villageois[nbVillageois] = gaulois;
			nbVillageois += 1;
		} else {
			System.out.println("Il n'y a plus de place" 
								+ gaulois.getNom() 
<<<<<<< HEAD
								+ "est Ã  la recherhche d'un autre village" );
=======
								+ "est à la recherhche d'un autre village" );
>>>>>>> fde8fb16f0b5bfdd2a9a8426eb78118a22340660
		}	
	}
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
							
	}
	
<<<<<<< HEAD
	public void afficherVillageois (){
		System.out.println("Dans le " 
							+ nom
							+ " du chef " 
							+ chef.getNom()
							+" vivent les lÃ©gendraires gaulois:");
		for(int i=0; i < nbVillageois; i++) {
			System.out.println("-"+ villageois[i].getNom());
		}
		
	}
	
	
	
	public static void main(String args[]) {
		Village village = new Village ("Village des IrrÃ©ductibles", 30);
		System.out.println(village.getNom());
		Chef chef = new Chef ("Abraracourcix", 6, 1, village);
		village.setChef(chef);
		
		Gaulois asterix = new Gaulois ("Asterix", 8);
		village.ajouterHabitant(asterix, 30);	
		System.out.println("Le gaulois "+ asterix.getNom() + " appertient au village");
		
		Gaulois obelix = new Gaulois ("Obelix", 25);
		village.ajouterHabitant(obelix, 30);
		System.out.println("Le gaulois "+ obelix.getNom() + " appertient au village");
		
		village.afficherVillageois();
		
	}
}
		
=======
	public afficherVillageois
	
	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		 this.chef = chef;
	 }
	
	public static void main(String args[]) {
		Village village = new Village("Village des Irréductible", 30);
		// Gaulois gaulois = village.trouverHabitant(30); 
		// On ne peut pas atteindre la valeur 30 dans le tableau
		// puisque ces indices vont de 0 à 29
		Chef chef = new Chef("Abraracourix", 6, 1, village);
		Gaulois asterix = new Gaulois("Asterix", 6);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		Le tableau est vide pour l'instant donc ça retourne NULL
		
		
	}
 }
>>>>>>> fde8fb16f0b5bfdd2a9a8426eb78118a22340660
