package polynome;

public class polynome {
	
	private int[] coeffs;

	public Polynome(int nbCoeffs) {
		if (nbCoeffs > 0) {
			this.coeffs = new int[nbCoeffs];
			for (int i = 0; i < this.coeffs.lenght; i++) {
				this.coeffs[i] = 0;
			}
		}
	}

	
}
