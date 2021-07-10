package Week2HomeWorks;

import java.util.Scanner;

public class NestedSwitchCase {
	public static void main(String[] args) {
	 
	Scanner input=new Scanner(System.in);
	System.out.println("Type any number Between 1 to 5");
	
	int one = input.nextInt();
	 int two;
	 switch(one) {
	 case 1: System.out.println("The number is :"+one);
	 break;
	 case 2:System.out.println("enter one more number Btw one and two");
	 Scanner input2= new Scanner(System.in);
	 two=input2.nextInt();
		 switch(two) {
		 case 1: System.out.println("The number is "+2);
		 }
	 }
	 
		
	}
}
