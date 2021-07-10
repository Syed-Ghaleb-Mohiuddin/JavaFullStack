package Week2HomeWorks;

public class PyramidReverse {
	public static void main(String[] args) {
		
	
		int reverseNum=6;
		for(int i=1;i<=reverseNum;i++) {
			for(int j=reverseNum;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
	}
	 
}
}