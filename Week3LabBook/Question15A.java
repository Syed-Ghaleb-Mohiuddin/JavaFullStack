package LabActivity;

public class Question15A {
	public static void main(String[] args) {	
	
		boolean isPrime;
		System.out.print("The Pime Numbers for 1 to 100 are :" + "  ");

		for (int i=2;i<=100;i++) {
			isPrime=true;
			for (int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
					
				}
			}
			if(isPrime) {
				System.out.print(i+", ");
			}
		}
	}
}
