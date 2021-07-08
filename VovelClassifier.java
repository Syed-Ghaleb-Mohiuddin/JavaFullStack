package Week2HomeWorks;

import java.util.Scanner;

public class VovelClassifier {
public static void main(String[] args) {
	
//	Scanner input = new Scanner(System.in);
//	
//	
//	char ch = (char)input.nextInt();
	char ch ='i';
	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
		 System.out.println(ch + " is vowel");
	}else {
		 System.out.println(ch + " is consonant");
	}
}
}
