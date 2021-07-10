package Week2HomeWorks;

import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array= new int[10];
		int sum=0;
		System.out.println("Enter 10 number to get thier sum");
		for (int i=0;i<10;i++) {
			array[i]= input.nextInt();
		}
		for (int num : array) {
		sum+=num;
		}
		System.out.println("The sum is : "+ sum);
	}
}
