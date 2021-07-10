package Week2HomeWorks;

import java.util.Scanner;

public class Triagle {

	public static void main(String args[]) {
			int rows,numbers=1,count,j;
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the number of rows");
			rows=input.nextInt();
			for(count = 1;count<=rows;count++) {
				for(j=1; j<=count;j++) {
				System.out.print(numbers+' ');
				numbers++;

			}
				System.out.println();		
	}
}
}