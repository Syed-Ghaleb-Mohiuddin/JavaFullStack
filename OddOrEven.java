package Week2HomeWorks;

import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		System.out.println("Enter Ant valu to Check whether it is a even or odd");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println((num%2==0)?"Entered number is Even":"Entered number is odd");
		
	}
}
