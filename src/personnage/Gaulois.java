package personnage;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	public Gaulois(String nom,int force) {
		this.nom =nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String text) {
		System.out.println(prendreParole()+ " "+ text);
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le Gaulois "+ nom + ":";
	}
	
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de "+romain.getNom());
		romain.receoirCoup(force*effetPotion/3);
		effetPotion--;
		if (effetPotion<1)
			effetPotion=1;
	}
}
