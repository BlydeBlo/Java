package shape;

public class Circle extends AbstractShape {

	private double radius;

	public Circle(double radius, double x, double y) {
		this.radius = radius;
		this.setCentreGravite(x, y);
	}

	public Circle(double radius){
		this(radius, 0, 0);
	}

	public Circle() {
		this(1.0);
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double radius = getRadius();
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "cercle de rayon  " + this.getRadius();
	}

}
