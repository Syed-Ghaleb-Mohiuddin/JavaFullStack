package Week2HomeWorks;

import java.util.Scanner;

public class SwitchCases {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
				System.out.println("please enter any number");
		int num=input.nextInt();
		switch(num) {
		case 1:
		System.out.println("the case number  : "+num);
			break;
			
		case 2 :
			System.out.println("the case number is : "+num);
			break;
		
		default:
			System.out.println("the default number is : "+num);
		}
	}
}
