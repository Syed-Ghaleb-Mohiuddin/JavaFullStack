package Week2HomeWorks;

import java.util.Scanner;

public class AreaOfCircle {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 System.out.println("Enter the radius");
	 double radius = input.nextDouble();
	 double area= Math.PI*(radius*radius);
	 System.out.println("The Area of the square : "+area);
	 double circumfrence=Math.PI*2*radius;
	 System.out.println("The circumfrence of the circle is : "+circumfrence);
}
}
