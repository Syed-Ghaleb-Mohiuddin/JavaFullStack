package LabActivity;

public class Question3 {
	/**
	 * 3. Write a program to declare all primitive data types with all
		possible types of initialization and also check implicit and explicit
		type casting by assigning them to each other.
	 * 
	 */
		public static void main(String[] args) {
			 
			 byte _b1=120;
			 
			byte $b_2=100;
			
			System.out.println("the value of byte b1 :"+_b1);
			System.out.println("the value of byte b2 :"+$b_2);	
			System.out.println("________________________");	
			System.out.println("the sum byte of b1 and b2 :"+(_b1+$b_2));
			short _s$1=5000;
			short _s2=10000;
			
			System.out.println("the value of short s1 :"+_s$1);
			System.out.println("the value of short s2 :"+_s2);
			System.out.println("the sum short of s1 and s2 :"+(_s$1+_s2));

			System.out.println("________________________");	
			System.out.println();

			int i_1 = 500;
			int i$2= 600;
			
			System.out.println("the value of int i1 :"+i_1);
			System.out.println("the value of int i2 :"+i$2);
			System.out.println("the sum int of i1 and i2 :"+(i_1+i$2));
			System.out.println("________________________");	
			System.out.println();
			long l1 = 500;
			long l2= 600;
			
			System.out.println("the value of long l1 :"+l1);
			System.out.println("the value of long l2 :"+l2);
			System.out.println("the sum long of l1 and l2 :"+(l1+l2));
			System.out.println("______________________________");
			System.out.println();

			float f1_=1000.123f;
			float f2$=1100.321f;
			System.out.println("the value of long f1 :"+f1_);
			System.out.println("the value of long f2 :"+f2$);
			System.out.println("the sum long of f1 and f2 :"+(f1_+f2$));
			System.out.println("______________________________");
			System.out.println();
			
			double $d1_=12345.123;
			double _d2$ = 1234567.1234;
			System.out.println("the value of long d1 :"+$d1_);
			System.out.println("the value of long d2 :"+_d2$);
			System.out.println("the sum long of d1 and d2 :"+($d1_+_d2$));
			System.out.println("______________________________");
			System.out.println();
			
			System.out.println("Implicit Type Casting  :");
			
			int a=100;
			long b=a;
			System.out.println(a);
			
			float c=1222.333f;
			double d=c;
			System.out.println(d);
			System.out.println();
			System.out.println("Explicit Type Casting ");
			long l=123456789;
			int i=(int)l;
			System.out.println(i);
			double dd=12345.123456;
			float ff=(float)dd;
			System.out.println(ff);
		}
}
