package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int forcePotion = 1;
	private int effetPotionMin;
	private int effetPotionMax;
<<<<<<< HEAD
	
=======
>>>>>>> fde8fb16f0b5bfdd2a9a8426eb78118a22340660
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
<<<<<<< HEAD
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a "
=======
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
>>>>>>> fde8fb16f0b5bfdd2a9a8426eb78118a22340660
			+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
<<<<<<< HEAD
		System.out.println(prendreParole() + "" + texte + "");
=======
		System.out.println(prendreParole() + "� " + texte + "�");
>>>>>>> fde8fb16f0b5bfdd2a9a8426eb78118a22340660
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMax);
<<<<<<< HEAD
		if (forcePotion > 7) {
			System.out.println("J'ai préparé une potion de force " + forcePotion + ". Vous m'en direz des nouvelles.");
		}else {
			System.out.println("Ma potion est seulement de force " + forcePotion + " mais cela suffira contre les Romains");
=======
		if (forcePotion > 8) {
			System.out.println("J'ai préparé une super potion de force " + forcePotion + ".");
		}else {
			System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion + ".");
>>>>>>> fde8fb16f0b5bfdd2a9a8426eb78118a22340660
		}
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obélix") {
			parler("Non, Obélix !... Tu n’auras pas de potion\r\n"
					+ "magique ! ");
		}else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
		
	
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> fde8fb16f0b5bfdd2a9a8426eb78118a22340660
