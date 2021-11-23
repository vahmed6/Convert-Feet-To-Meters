// this program will convert from feet to meters and display result

import java.util.Scanner;

public class ConvertMeters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create the scanner object
		Scanner input = new Scanner(System.in);
		
		// create a constant value
		final double METERS_PER_FOOT = 0.305;
		
		// prompt the user to enter a number in feet
		System.out.print("Enter a value in feet: ");
		double feet = input.nextDouble();
		
		// convert from feet to meters
		double meters = feet * METERS_PER_FOOT;
		
		// display the result
		System.out.println(feet + " feet is " + meters + " meters");
		
	}

}
