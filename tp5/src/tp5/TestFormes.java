package tp5;

public class TestFormes {
	
	public static boolean compare(Forme f1, Forme f2) {
		return(f1.surface() > f2.surface());
	}
	
	public static void main(String[] args) {
		Forme f1 = new Carre(10);
		Forme f2 = new Cercle(10);
		if (compare(f1, f2)) {
			System.out.println("Carré > Cercle");
		} else {
			System.out.println("Carré < Cercle");
		}
	}
}
