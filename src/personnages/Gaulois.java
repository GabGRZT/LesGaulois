package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "" + texte + "");
	}
	
	public String    prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
		
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de "
				+ romain.getNom());
		force = (force/3)*effetPotion;
		romain.recevoirCoup(force);
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci druide, je sens que ma force est " + effetPotion + " fois decuplee");
	}
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
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