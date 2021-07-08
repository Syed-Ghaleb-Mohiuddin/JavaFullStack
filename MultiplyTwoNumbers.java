package Week2HomeWorks;

import java.util.Scanner;

public class MultiplyTwoNumbers {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int number = value.nextInt();
		System.out.println("Enter the second number : ");
		int number2 = value.nextInt();
		int result = number * number2;
		System.out.println("The product is : "+result);
	

	}
}
