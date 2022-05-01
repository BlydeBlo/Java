package maths;

public class Matrix {

	private double[][] coeffs;

	public Matrix(int nbRows, int nbColumns) {
		if (nbRows > 0 && nbColumns > 0) {
			this.coeffs = new double[nbRows][nbColumns];
			for (int i = 0; i < this.coeffs.length; i++) {
				for (int j = 0; j < this.coeffs[i].length; j++) {
					this.coeffs[i][j] = 0.0;
				}
			}
		} else {
			this.coeffs = new double[0][0];
		}
	}

	public Matrix(double[][] m) {
		this(m.length, m[0].length);
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				this.coeffs[i][j] = m[i][j];
			}
		}
	}

	public Matrix(Matrix m) {
		this.coeffs = m.coeffs;
	}

	public int getNbRows() {
		return this.coeffs.length;
	}

	public int getNbColumns() {
		if (this.getNbRows() > 0) {
			return this.coeffs[0].length;
		} else {
			return 0;
		}
	}

	public double get(int row, int column) {
		if (row < 0 || row >= this.getNbRows() || column < 0
				|| column >= this.getNbColumns()) {
			return Double.POSITIVE_INFINITY;
		} else {
			return this.coeffs[row][column];
		}
	}

	public void set(int row, int column, double value) {
		if (row >= 0 && row < this.getNbRows() && column >= 0
				&& column < this.getNbColumns()) {
			this.coeffs[row][column] = value;
		}
	}

	public String toString() {
		String res = "";
		for (int i = 0; i < this.getNbRows(); i++) {
			for (int j = 0; j < this.getNbColumns(); j++) {
				res = res + this.get(i, j) + "\t";
			}
			res = res + "\n";
		}
		return res;
	}
	
	public double sum() {
		double res;
		res = 0;
		for(int i = 0; i < this.getNbRows(); i++) {
			for (int j = 0; j < this.getNbColumns(); j++) {
				res = res + this.get(i, j);
			}
		}
		return res;
	}
	
	public boolean allPositive() {
		for(int i = 0; i < this.getNbRows(); i++) {
			for (int j = 0; j < this.getNbColumns(); j++) {
				if (this.get(i, j) < 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public Matrix somme(Matrix m1) {
		double acc;
		acc = 0;
		if (this.getNbRows() == m1.getNbRows() && this.getNbColumns() == m1.getNbColumns()) {
			Matrix msum = new Matrix(m1.getNbRows(), m1.getNbColumns());
			for(int i = 0; i < this.getNbRows(); i++) {
				for (int j = 0; j < this.getNbColumns(); j++) {
					acc = this.get(i, j) + m1.get(i, j);
					msum.set(i, j, acc);
				}
			}
			return msum;
		}
		else {
			return null;
		}
	}
	
	public Matrix product(Matrix m){
        if (this.getNbColumns() == m.getNbRows()) {
            Matrix res = new Matrix(this.getNbRows(), m.getNbColumns());
            double tmp;
            for (int i = 0; i < this.getNbRows(); i++) {
                for (int j = 0; j < m.getNbColumns(); j++) {
                    tmp = 0;
                    for (int k = 0; k < this.getNbColumns(); k++) {
                        tmp += this.get(i, k) * m.get(k, j);
                    }
                    res.set(i, j, tmp);
                }
            }
            return (res);
        } else {
            return (null);
        }
    }

	public static void main(String[] args) {
		Matrix m1 = new Matrix(2, 3);
		m1.set(0, 0, 1.1);
		m1.set(0, 1, 1.2);
		m1.set(0, 2, -1.3);
		m1.set(1, 0, -2.1);
		m1.set(1, 1, 2.2);
		m1.set(1, 2, 2.3);
		double[][] tab = { { 1.1, 1.2, 1.3 }, { 2.1, 2.2, 2.3 }, { 3.1, 3.2, 3.3 }  };
		Matrix m2 = new Matrix(tab);
		System.out.println(m2);
		double sum = m2.sum();
		System.out.println(sum);
		boolean positive = m2.allPositive();
		System.out.println(positive);
		Matrix m3 = m2.somme(m1);
		System.out.println(m3);
		System.out.println(m1.product(m2));		
	}
}