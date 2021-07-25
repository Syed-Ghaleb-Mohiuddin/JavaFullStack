package LabActivity;

import java.util.Scanner;

public class Question4 {
/**
		4. Write a program to find weather a number is Prime or not 
 */
	public static void main(String[] args) {
		
		System.out.println("The program to Print Prime number or not... Please enter a number");
		
		Scanner input = new Scanner(System.in);
		
		int a=input.nextInt();
		
		if(a%2==0) {
			System.out.println("The number is a Prime Number");
		}
		else System.out.println("the number is not a prime number");
	}
	
}
