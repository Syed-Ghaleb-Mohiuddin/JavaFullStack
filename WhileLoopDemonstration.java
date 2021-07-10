package Week2HomeWorks;

import java.util.Scanner;

public class WhileLoopDemonstration {
	public static void main(String[] args) {
		int sum=0,number;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Give the number below 10 : ");

		number = scan.nextInt();
		
		while(number <=10) {
		sum = sum+number;
		number++;
		}
		System.out.println("Sum of the number through while loop i : %"+sum);
	}
}
