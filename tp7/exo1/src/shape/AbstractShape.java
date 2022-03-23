package shape;

public abstract class AbstractShape implements Shape{

	private double[] centreGravite = new double[2];

	public double[] getCentreGravite() {
		return centreGravite;
	}

	public void setCentreGravite(double x, double y) {
		this.centreGravite[0] = x;
		this.centreGravite[1] = y;
	}

	public void translater(double x, double y){
		centreGravite[0] += x;
		centreGravite[1] += y;
	}

    public abstract double area();

    @Override
	public boolean isBigger(Shape shape) {
		return this.area() > shape.area();
	}

	
}
