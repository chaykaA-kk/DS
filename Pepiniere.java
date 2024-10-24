package ds;

public class Pepiniere {
	private plante[] tab;
	private final int MAX_PLANTES=1000;
	private  int  nombreDePlantes=0;
	
	
	public Pepiniere() {
		tab=new plante[MAX_PLANTES];
		
	}
	void ajoutPlante(plante plante) {
		if(nombreDePlantes >=MAX_PLANTES) {
			System.out.println("erreur le tableau est plein");
		}
		else {
			tab[nombreDePlantes]=plante;
			nombreDePlantes++;
		}
	}
	public void afficherInventaire() {
		for(int i=0;i<nombreDePlantes;i++) {
			tab[i].description();
			if(tab[i] instanceof Fleure) {
				((Fleure)tab[i]).fleurir();			}
		}
	}
	public double totalAbsorptionTotaleCO2() {
		int s=0;
		for(int i=0;i<nombreDePlantes;i++) {
			if(tab[i] instanceof Arbre) {
				s=s+((Arbre)tab[i]).absorbation();
			}
		}
		return s;
	}
	public int compterArbresCaduques() {
		int nbr=0;
		for(int i=0;i<nombreDePlantes;i++) {
			if(tab[i] instanceof Arbre) {
				if(((Arbre)tab[i]).getType_feuillage().equalsIgnoreCase("caduque")){
					nbr++;
				}
			}}
		return nbr;
	
	
	}
}
