package Week2HomeWorks;

public class SwapTwoNumbers {
 public static void main(String[] args) {
	float firstNum = 5.5f, secondNum = 2.2f;
	System.out.println("--Before swap--");
	 System.out.println("First number = " + firstNum);
	 System.out.println("Second number = " + secondNum);
	 float tem = firstNum;
	 firstNum = secondNum;
	 
	 secondNum = tem;
	 System.out.println("--After swap--");
	 System.out.println("First number = " + firstNum);
	 System.out.println("Second number = " + secondNum); 
 }
}
