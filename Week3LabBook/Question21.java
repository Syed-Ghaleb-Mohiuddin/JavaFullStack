package LabActivity;

import java.util.Scanner;

public class Question21 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter a number to know how many days are there in that month");
		
		int num=input.nextInt();
		
		switch(num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("There are 31 days in this month");
			break;
		case 2:
			System.out.println("How many years before was the last leap year?");
			int leap = input.nextInt();
		if(leap==5) System.out.println("This is a leap year that's why it has 28 days");
		else System.out.println("it is not a leap year that's why it has 29 days");
			break;
		
		case 4:
		case 6:
		case 11:
			System.out.println("There are 30 day in this month");
			break;
			
			default :
				System.out.println("Enter a valid number");
		}
	}
}
