package tp6;

public class Point2D extends Point1D{

	private double y;

	public Point2D(double x, double y) {
		super(x);
		this.y = y;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2D [y=" + y + "]";
	}
	
	
	@Override
	public boolean equals(Object point2) {
		if (point2 instanceof Point2D) {
			Point2D p2 = (Point2D) point2;
			if (this.getX() == p2.getX() && this.getY() == p2.getY())
				return true;
		}
		return false;
	}
	
}
