package thirtyjavaprogram;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Fahrenheit: ");
			double f = sc.nextDouble();
			
			double c = (f - 32)* 5/9;
			System.out.println("Celsius= "+c);
		}

	}

}
