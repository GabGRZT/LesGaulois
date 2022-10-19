package personnages;

import java.util.Iterator;

import territoires.Musee;

public class Gaulois {
	
	private String nom;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement []trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "" + texte + "");
	}
	
//	public String    prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		return ("Le gaulois " + nom + " : ");
	}
		
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de "
//				+ romain.getNom());
//		force = (force/3)*effetPotion;
//		romain.recevoirCoup(force);
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement [] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
	}

	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci druide, je sens que ma force est " + effetPotion + " fois decuplee");
	}
	
	public void faireUneDonation(Musee musee) {
		prendreParole();
		if (trophees.length != 0) {
			System.out.println("Je donne tous mes trophees:");
			for (int i = 0; i<nbTrophees;) {
				musee.donnerTrophees(new Gaulois("Asterix", 6), this.trophees[i]);
			}
			}else {
			System.out.println("Je n'ai pas de trophees");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("BEGIN");
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		System.out.println(asterix.prendreParole());
		asterix.parler("Je parle");
		Romain cesar = new Romain("Cesar", 12);
		Romain marius = new Romain("Marius", 5);
		asterix.frapper(cesar);
		asterix.frapper(marius);
		asterix.boirePotion(3);
		System.out.println("END");
	}
}