package LabActivity;

import java.util.Scanner;

public class Question19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter The size of the array :");
		int value = input.nextInt();
		
		int arr[] = new int[value];
		
		int temp;
		int start =0;
		int end = value-1;
		System.out.println("Enter the array values :");
		
		for (int j=0;j<value;j++) {
			arr[j]=input.nextInt();
		}
		while (start<end) {
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("Reversed numbers :");
		
//		for (int j=0;j<value;j++) {
//			System.out.println(arr[j]);
//		}
		for (int i=0;i<value;i++) {
			System.out.println(arr[i]);
		}
	}
}
