package Week2HomeWorks;

public class NestedForLoop {
	public static void main(String[] args) {
		for(int i = 1;i<=3;i++) {
			System.out.println("__________________________________________");
			System.out.println("i : "+i);
			

			for(int j=0;j<=4;j++) {
				System.out.println("__________________________________________");
				System.out.println("j : "+j);
			}
		}
	}
}
