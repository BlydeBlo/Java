package sequence;

public class Sequence {

	public static int u(int n, int u0, int u1) throws SequenceException {
		if (n == 0)
			return u0;
		if (n == 1)
			return u1;
		try {
			int un_1 = u(n - 1, u0, u1);
			int un_2 = u(n - 2, u0, u1);
			return (n % 2 == 0) ? un_1 / un_2 - un_2 / un_1 : un_2 / un_1
					- un_1 / un_2;
		} catch (ArithmeticException e) {
			SequenceException exception = new SequenceException(
					"division par 0");
			exception.addTrace("dans u(" + n + ", " + u0 + ", " + u1
					+ ")");
			throw exception;
		} catch (SequenceException e) {
			e.addTrace("qui est appel�e dans u(" + n + ", " + u0 + ", "
					+ u1 + ")");
			throw e;
		}
	}

	public static void main(String[] args) {
		int n = 10;
		int u0 = 100;
		int u1 = 2;
		try {
			System.out.println("u" + n + " = " + u(n, u0, u1) + " avec u0 = "
					+ u0 + " et u1 = " + u1);
			// u1 = 1;
			// System.out.println("u" + n + " = " + u(n, u0, u1) + " avec u0 = "
			// + u0 + " et u1 = " + u1);
			if (args.length == 3) {
				n = Integer.parseInt(args[0]);
				u0 = Integer.parseInt(args[1]);
				u1 = Integer.parseInt(args[2]);
				System.out.println("u" + n + " = " + u(n, u0, u1)
						+ " avec u0 = " + u0 + " et u1 = " + u1);
			} else {
				System.err
						.println("Le nombre d'arguments doit �tre �gal � trois");
			}
		} catch (NumberFormatException e) {
			System.err.println("Les arguments doivent �tre des entiers");
		} catch (SequenceException e) {
			System.err.println("[ERREUR]" + e);
		}
	}
}
