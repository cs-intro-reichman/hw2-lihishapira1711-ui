// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
			int n = Integer.parseInt(args[0]);
			double piApproximation = 0.0;
			for (int k = 0; k < n; k++) {
				double term = Math.pow(-1, k) / (2 * k + 1);
				piApproximation += term;
			}
			piApproximation *= 4;
			System.out.println("pi according to Java: " + Math.PI);
			System.out.println("pi, approximated:     " + piApproximation);
	}
}
