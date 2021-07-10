package Week2HomeWorks;

import java.util.Scanner;

public class AreaOfTheSquare {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please Enter the side valeu to know the area");
		
		double number = input.nextDouble();
		double Area = number * number;
		System.out.println("the Area of the square is : "+Area);
	}
}
