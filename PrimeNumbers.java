package Week2HomeWorks;

public class PrimeNumbers {
	public static void main(String[] args) {
		
	String primeNums="";
		for(int i=1;i<=100;i++) {
			int counter = 0;
			for (int num = i ;num >=1;num--) {
				if(i%num ==0) {
					counter+=1;
				}
				if(counter==2) {
					primeNums+=i+" ";
				}
			}
			
		}
		System.out.println("prime numbers from 1 to 100 are :");
		System.out.println(primeNums);
	}
}	
