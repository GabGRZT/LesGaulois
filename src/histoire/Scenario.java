package histoire;

import personnages.*; 

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		asterix.parler("Bonjour à tous");
		Romain minus = new Romain ("Minus", 6);
		minus.parler("UN GAU...UN GAUGAU...");
		minus.recevoirCoup(2);
		minus.recevoirCoup(2);
		minus.recevoirCoup(2);
		
	}

}