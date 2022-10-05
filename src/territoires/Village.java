package territoires;

public class Village {
	private String nom;
	
	
	public Village(String nom) {
		this.nom = nom;
		
	}

	public String getNom() {
		return nom;
	}

	
	public static void main(String args[]) {
		Village alesia = new Village("Alesia");
		System.out.println(alesia.getNom());
	}
 }