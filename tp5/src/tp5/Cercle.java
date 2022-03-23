package tp5;

public class Cercle implements Forme{
	/*Attribut*/
	private double rayon;
	
	/*Constructeur*/
	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	/*Accesseur*/
	public double getRayon(){
		return(rayon);
	}
	
	/*Calcul de la surface*/
	@Override
	public double surface() {
		return(Math.pow(getRayon(), 2)*Math.PI);
	}
	
	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}
	
	
}
