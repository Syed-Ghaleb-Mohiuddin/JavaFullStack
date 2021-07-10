package Week2HomeWorks;

import java.util.Scanner;

public class AreaOfAReactangle {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please Enter the lenght of Reactangle : ");
		double lenght= input.nextDouble();
		System.out.println("Enter the width of the rectangle");
		double width = input.nextDouble();
		double sum = lenght*width;
		System.out.println(" the area of the reactangle is : "+ sum);
	}
}
