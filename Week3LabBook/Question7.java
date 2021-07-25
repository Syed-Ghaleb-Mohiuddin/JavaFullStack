package LabActivity;

public class Question7 {
	public static void main(String[] args) {
		/*
		 * 7. Write a program to sort an array element in ascending or
				descending order 

		 */
		
		int a[] = new int[] {3,2,4,1,5};

		int temp=0;
		System.out.print("Initial Numbers :");
		for (int i : a) {
			System.out.print(" " +i+" ");
		}
		/////////////////////////////////////////////////////////
		System.out.println();
		System.out.print("Acending Order :");
		for(int i=0;i<a.length;i++) {

			for(int j=i+1;j<a.length;j++) {

				if(a[i]>a[j]) {
					

					temp= a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]+" ");
		}
		
		
		/////////////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.print("Decending Order :");	
		for(int i=0;i<a.length;i++) {

			for(int j=i+1;j<a.length;j++) {

				if(a[i]<a[j]) {
					

					temp= a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]+" ");
		}
	}
}
