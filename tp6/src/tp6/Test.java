package tp6;

public class Test {
	
	public static void afficherEgal(Point1D[] tab, Point1D p) {
		int acc = 0;
		for (int i = 0; i < tab.length; i++) {
			if (p == tab[i]) {
				acc++;
			}
		}
		System.out.println("Nbr = " + acc);
	}
	
	public static void main(String[] args) {
		Point1D p10 = new Point1D(5);
		Point1D p11 = new Point1D(5);
		
		//Point2D p20 = new Point2D(5, 5);
		
		//Point3D p30 = new Point3D(10, 5 , 10);
		
		Point1D[] tab10 = {p10, p11};
		
		if (p10.equals(p11)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		afficherEgal(tab10, p10);
	}
	
}
