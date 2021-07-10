package Week2HomeWorks;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the width of the rectangle : ");
		double base = input.nextDouble();
		System.out.println("please enter the height of the Triangle : ");
		double height = input.nextDouble();
		
		double area = (base * height)/2;
		System.out.println("the area of the rectangle is : "+area);
	}
}
