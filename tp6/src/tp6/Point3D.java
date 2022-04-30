package tp6;

public class Point3D extends Point2D{
	private double z;
	
	public Point3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	public double getZ() {
		return z;
	}
	
	public void setZ(double z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "Point3D [z=" + z + "]";
	}
	
	@Override
	public boolean equals(Object point3) {
		if (point3 instanceof Point3D) {
			Point3D p3 = (Point3D) point3;
			if (this.getX() == p3.getX() && this.getY() == p3.getY() && this.getZ() == p3.getZ())
				return true;
		}
		return false;
	}
	
}
