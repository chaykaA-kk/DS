package ds;

public class test {

	public static void main(String[] args) {
	    System.out.println("Pépinière GREEN HANDS");
	    Pepiniere p = new Pepiniere();
	    Fleure rose = new Fleure(null, 30., 12, 15.99, "Rouge", 2);
	    Fleure tulipe=new Fleure("Tulipe", 20., 8, 12.99, "Jaune", 4);
	    Arbre chêne=new Arbre("Chêne", 200, 60, 89.99, "Caduque");
	    Arbre sapin=new Arbre("Sapin", 150, 30, 59.99, "Persistant");
	    rose.setNom("Rose");
	    System.out.println("La " + rose.getNom() + " a le couleur " + rose.getCouleur());
	    p.ajoutPlante(rose);
	    p.ajoutPlante(tulipe);
	    p.ajoutPlante(chêne);
	    p.ajoutPlante(sapin);
	    p.afficherInventaire();
	    System.out.println("Total Aborption CO2" + p.totalAbsorptionTotaleCO2());
	    System.out.println("Nombre d'arbres Caduques dans la pépinière : " + p.compterArbresCaduques());
	}


}
