package LinearStructures;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * A triangle is given by the lengths of its sides a, b, and c. Develop an algorithm and write a program to calculate:
 */
public class LinearStructure13 {

	public static void main(String[] args) {

		// Declare variables
		double a, b, c, la, ma;
		DecimalFormat df = new DecimalFormat("#.##");
		// Input data
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of side a: ");
		a = input.nextDouble();
		System.out.println("Enter the value of side b: ");
		b = input.nextDouble();
		System.out.println("Enter the value of side c: ");
		c = input.nextDouble();

		// Calculate the length of the angle bisector from vertex A
		la = 1 / (b + c) * Math.sqrt(b * c * (Math.pow(b + c, 2) - Math.pow(a, 2)));

		// Calculate the length of side a
		ma = 0.5 * Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - a * a);

		// Print the values
		System.out.println("La = " + df.format(la) + "\nma = " + df.format(ma));

		input.close();
	}

}
