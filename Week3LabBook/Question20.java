package LabActivity;

public class Question20 {
	public static void main(String[] args) {
		int largest;
		int arr[][]= {
				{2,4,7,9},
				{3,6,19,4},
				{8,1,45,5}
		};
		
		System.out.println("Array :");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("The Largest Element in each row : ");
		for(int i=0;i<arr.length;i++) {
			largest = arr[i][0];
			for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]>largest) {
				largest = arr[i][j];
			}
			}
		System.out.println(largest);
		}
		
	}
}
