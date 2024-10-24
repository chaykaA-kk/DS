package ds;

public class Arbre extends plante  {
	private String type_feuillage;
	private final int AbsorMoyenne=22;
	
	public Arbre(String nom,double hauteur,int age,double prix,String type_feuillage ) {
		super(nom,hauteur,age,prix);
		this.type_feuillage=type_feuillage;
	}
	

	public String getType_feuillage() {
		return type_feuillage;
	}

	@Override
	public String toString() {
		return "Arbre [type_feuillage=" + type_feuillage + ", AbsorMoyenne=" + AbsorMoyenne + "]";
	}
	public int absorbation() {
		if(hauteur>50) {
			return AbsorMoyenne+3;
		}
		else {
			return AbsorMoyenne;
		}
	}
	public void description() {
		System.out.println(getClass().getSimpleName());
		System.out.println(super.toString());
		System.out.println(toString());
	}
	

}
