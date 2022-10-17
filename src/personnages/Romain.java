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
	
//	public void recevoirCoup(int forceCoup) {
//		assert (force>0):"force negative";
//		int force1 = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aie");
//		} 
//		else {
//			parler("J'abandonne...");
//		}
//		assert (force1 > force):"force romain n'a pas diminue";
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculresistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		switch (force) {
		case 0:
			parler("Aïe");
			break;
		case 1:
			parler("J'abandonne...");
			equipementEjecte = ejecterEquipement();
			break;
		default:
			break;
		}
		// post condition la force à diminuer
		assert force < oldForce;
		return equipementEjecte;
	}
	
	private int calculresistanceEquipement(int forceCoup) {
		String parole;
		parole = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			parole += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			parole += resistanceEquipement + "!";
		}
		parler(parole);
		forceCoup -= resistanceEquipement;
		return forceCoup;
		}
		
	private Equipement[] ejecterEquipement() {
		System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				}
		}
			return equipementEjecte;
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