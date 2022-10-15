package territoires;

import personnages.*;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois [] villageois;
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
	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];			
	}
	
	public void afficherVillageois (){
		System.out.println("Dans le " 
							+ nom
							+ " du chef " 
							+ chef.getNom()
							+" vivent les légendraires gaulois:");
		for(int i=0; i < nbVillageois; i++) {
			System.out.println("-"+ villageois[i].getNom());
		}
		
	}
	
	
	
	public static void main(String args[]) {
		Village village = new Village ("Village des Irréductibles", 30);
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
