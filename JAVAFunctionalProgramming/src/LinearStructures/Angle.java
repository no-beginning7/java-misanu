package LinearStructures;

import java.util.Scanner;

//Write a program to calculate the sine and cosine of an angle given in radians.

public class Angle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of the angle in radians: ");
		double x = input.nextDouble();
		System.out.println("The sine of the given angle is: " + Math.sin(x));
		System.out.print("The cosine of the given angle is: " + Math.cos(x));
	}

}
