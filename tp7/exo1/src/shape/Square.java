package shape;

public class Square extends AbstractShape {

	private double side;

	public Square(double side, double x, double y) {
		this.side = side;
		this.setCentreGravite(x, y);
	}

	public Square(double side){
		this(side, 0, 0); // this() == appel constructeur == Square()
	}

	public Square() {
		this(1.0);
	}

	public double getSide() {
		return this.side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		double side = getSide();
		return side * side;
	}

	@Override
	public String toString() {
		return "carr� de c�t� " + this.getSide();
	}
}
