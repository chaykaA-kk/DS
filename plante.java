package ds;

public class plante {
	protected String nom;
	protected double hauteur;
	protected int age;
	protected double prix;
	
	public plante(String nom,double hauteur,int age,double prix) {
		this.nom=nom;
		this.hauteur=hauteur;
		this.age=age;
		this.prix=prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "plante [nom=" + nom + ", hauteur=" + hauteur + ", age=" + age + ", prix=" + prix + "]";
	}

	public void description() {
		this.toString();
		System.out.println(toString());
	}
	
	
	
}
