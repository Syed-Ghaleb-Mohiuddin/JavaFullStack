package LabActivity;

import java.util.Scanner;

import jdk.jfr.Percentage;

public class Question15B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value to know whether it is Armstrong,perfect or palendrom numbers");
		int value = input.nextInt();
		int temp=value;
		int r,sum=0;
		int perfect=0;
		int palendrom=0;
		/////////////////////////////////Armstrong
		while(value>0) {
			r=value%10;
			value=value/10;
			sum =sum +r*r*r;
			palendrom=palendrom*10+r;
		}
		//////////////////////////////////////perfert
		for(int i=1;i<temp;i++) {
			if(temp%i==0) {
				perfect=perfect+i;
			}
		}
		////////////////////////////////////////palendrom
		
		if(temp==sum) {
			System.out.println("Its an Armstrong Number");
		}
		else if(temp==perfect) {
			System.out.println("It is a perfect number");
		}
		else if(temp==palendrom) {
			System.out.println("It is a palendrome number");
		}
		else System.out.println("It is not an Armstrong nither perfect nor palendrome");
		
	}
}
