import java.io.*;
import java.util.*;

public class RK4 {
	public static void main(String args[]) {
		RK4 d1 = new RK4();
		double x0, y, x, h;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value Of xo:");
		x0 = sc.nextDouble();
		System.out.println("Enter Value Of yo:");
		y = sc.nextDouble();
		System.out.println("Enter Value Of x:");
		x = sc.nextDouble();
		System.out.println("Enter Value Of h:");
		h = sc.nextDouble();

		System.out.println("\nThe value of y at x is : " + d1.rungeKutta(x0, y, x, h));
	}

	double dydx(double x, double y) {
		return (-2 * (x) * (Math.pow(y, 2)));
	}

	double rungeKutta(double x0, double y0, double x, double h) {
		RK4 d1 = new RK4();
		int n = (int) ((x - x0) / h);

		double k1, k2, k3, k4;
		double y = y0;
		for (int i = 1; i <= n; i++) {
			k1 = h * (d1.dydx(x0, y));
			k2 = h * (d1.dydx(x0 + 0.5 * h, y + 0.5 * k1));
			k3 = h * (d1.dydx(x0 + 0.5 * h, y + 0.5 * k2));
			k4 = h * (d1.dydx(x0 + h, y + k3));

			y = y + (1.0 / 6.0) * (k1 + 2 * k2 + 2 * k3 + k4);

			x0 = x0 + h;
		}
		return y;
	}

}
