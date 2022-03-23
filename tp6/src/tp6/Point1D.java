package tp6;

public class Point1D {
	
	private double x;

	public Point1D(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Point1D [x=" + x + "]";
	}
	
	@Override
	public boolean equals(Object point) {
		if (point instanceof Point1D) {
			Point1D p = (Point1D) point;
			if (this.getX() == p.getX()) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
}
