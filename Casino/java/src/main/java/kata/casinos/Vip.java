package kata.casinos;

public class Vip {

	String nom;
	String prenom;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	@Override
	public String toString() {
		return nom + " " + prenom;
	}
}
