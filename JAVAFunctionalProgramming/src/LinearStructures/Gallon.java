package LinearStructures;

import java.util.Scanner;

//Write a program to convert gallons to liters. Note: 1 gallon = 4.54 L.

public class Gallon {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the volume in gallons: ");
		double g = input.nextDouble();
		System.out.println("The volume in liters is: " + (g * 4.54));

		input.close();
	}

}
