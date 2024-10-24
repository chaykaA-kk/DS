package ds;

public class Fleure extends plante{
	private String couleur;
	private int moisF;
	
	public Fleure(String nom, double hauteur,int age,double prix,String couleur ,int moisF) {
		super(nom,hauteur,age,prix);
		this.couleur=couleur;
		this.moisF=moisF;
	}


	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return "Fleure [couleur=" + couleur + ", moisF=" + moisF + "]";
	}
	public void description() {
		System.out.println(super.toString());
		System.out.println(toString());
	}
	public void fleurir() {
		if(this.moisF==4 || this.moisF==5 || this.moisF==6 ) {
			System.out.println("c'est une plante!");
		}
		else {
			System.out.println("n'est pas une plante!");
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
