package Week2HomeWorks;

import java.util.Scanner;

public class PrimeNumberChecker {
 public static void main(String[] args) {
	boolean PrimeNum = true;
	Scanner input= new Scanner(System.in);
	System.out.println("Please enter any number to check whether it is a prime number or not");
	int num = input.nextInt();
	input.close();
	for( int i = 2 ;i<=num/2;i++) {
		int temp= num%i;
		if(temp ==0) {
			PrimeNum=false;
			break;
		}
		
	}
	if(PrimeNum) {
		System.out.println(num + " is a prime number ");
	}
	else System.out.println(num + " it not a prime number ");
}
}
