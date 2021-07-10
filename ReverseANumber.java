package Week2HomeWorks;

import java.util.Scanner;

public class ReverseANumber {
public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Please gimme a number");
	
	int num = input.nextInt();
	int reverseNum=0;
	while(num!=0) {
		reverseNum*=10;
		reverseNum+=num%10;
		num/=10;
	}
	System.out.println("the reverse number is :"+reverseNum);
		System.out.println("******************************");

}
}
