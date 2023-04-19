package LinearStructures;

import java.io.InputStreamReader;

/*
 *		Create an algorithm and write a program that calculates the surface area and volume of a cube based on the entered side length a. Print the surface area and volume of the cube on the output.
 
 */
public class LineStructure5 {

	public static void main(String[] args) {

		// a - side length of the cube
		// p - surface area of the cube
		// v - volume of the cube
		double a, p, v;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Enter the side length of the cube
		System.out.print("Enter the side length of the cube a: ");
		a = Double.parseDouble(input.readLine());
		// Calculate the surface area and volume of the cube
		p = 6 * a * a;
		v = Math.pow(a, 3);
		// Print the calculated values of the surface area and volume of the cube
		System.out.println("For the entered side length of the cube a = " + a + ", the calculated surface area is " + p
				+ " and the volume is " + v);
	}

}
