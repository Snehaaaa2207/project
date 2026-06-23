package thirtyjavaprogram;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Number: ");
			int num =sc.nextInt();
			System.out.println("Number you have entered is: "+num);
		}
		

	}

}
