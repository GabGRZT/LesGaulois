package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert (force>0):"force negative";
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "" + texte + "");
	}
	
	public String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert (force>0):"force negative";
		int force1 = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} 
		else {
			parler("J'abandonne...");
		}
		assert (force1 > force):"force romain n'a pas diminue";
	}
	
	private void equipement(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'equipe d'un " + 
				equipement + ".");
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
				case 2: {
					System.out.println("Le soldat " + nom + " est deja bien protégé !");
					break;
				}
				case 1: {
					if (equipements[0] == equipement) {
						System.out.println("Le soldat " + nom + " possede déjà un " + 
								equipement + ".");
						break;
					} else {
						equipement(equipement);
						break;
					}
				}
				default : {
					equipement(equipement);
					break;
				}
			}
		}
	
	public static void main(String[] args) {

		Romain minus = new Romain ("Minus", 6);
		Romain cesar = new Romain("Cesar", 18);
		System.out.println(cesar.prendreParole());
		cesar.parler("Bonjour");
		cesar.recevoirCoup(10);
		cesar.recevoirCoup(10);
		minus.parler("Ne me frappez pas");
		minus.recevoirCoup(1);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}