package thirtyjavaprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean prime = true;
		for(int i = 2; i< n;i++) {
		if( n % i ==0) {
			prime = false;
			break;
		}
		}
		if(prime && n >1) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime ");
			
			sc.close();
		}
				

	}

}
