package LabActivity;

public class Question13 {
	public static void main(String[] args) {
			int total=0;

		int marks[][]= {
				{70,80,90,100},
				{100,90,98,75},
				{70,80,90,100},
				{70,100,90,85},
				{90,97,80,100},

		};
		System.out.println("Students "+"\tMaths"+"\tEnglish"+"\tScience"+"\tSocial");

		for(int i =0;i<marks.length;i++) {

			System.out.print("Student "+(i+1)+" : \t");
			for(int j = 0; j<marks[i].length;j++) {
				total+=marks[i][j];
				System.out.print(marks[i][j]+ "\t");
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The Grand Total is : "+total);
	}
}
