package tp5;

public class Carre implements Forme{
	/*Attribut*/
	private double longueur;
	
	/*Constructeur*/
	public Carre(double longueur) {
		this.longueur = longueur;
	}
	
	/*Accesseur*/
	public double getLongueur() {
		return(longueur);
	}

	@Override
	public double surface() {
		return(getLongueur()*getLongueur());
	}

	@Override
	public String toString() {
		return "Carre [longueur=" + longueur + "]";
	}
	
	
}