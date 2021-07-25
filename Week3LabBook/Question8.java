package LabActivity;

public class Question8 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.print("Initial Elements : ");
		int temp=0;
		for (int i : a) {
			System.out.print(i+" ");

		}
		
		for(int i=0; i<a.length;i++) {
			for(int j =i+1;j<a.length;j++) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			
			}

		}
		System.out.println();
		System.out.print("Reversed Elements :");
		for (int f : a) {
			System.out.print(f+" ");
		}
	}
}
