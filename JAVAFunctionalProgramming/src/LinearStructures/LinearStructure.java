package LinearStructures;

import java.io.InputStreamReader;
import java.util.Scanner;

//Write an algorithm and program that calculates the value of the function 'f' based on the entered values of x, y, z. Print the value of the function on the output.

public class LinearStructure {

	public static void main(String[] args) throws Exception {
		double x, y, z, f;
		// Unos podataka
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite vrednost za x: ");
		x = ulaz.nextDouble();
		System.out.print("Unesite vrednost za y: ");
		y = ulaz.nextDouble();

		System.out.print("Unesite vrednost za z: ");
		z = ulaz.nextDouble();

		// Izračunavanje vrednosti funkcije f
		f = Math.pow((x + 3 * z + y) / 2 * x, 4) - x / (x + 3 * z - y);
		// Štampanje rezultata
		System.out.println("Vrednost funkcije f je " + f);

	}

}
