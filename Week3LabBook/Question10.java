package LabActivity;

public class Question10 {
	/*
	 * Write a program to display number matrix as follows using
		Two Dimensional Rectangular Array.
		1 2 3 4
		5 6 7 8
		9 10 11 12
		13 14 15 16

	 */
	public static void main(String[] args) {
		int x[][]= {
		{1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,15,16},
		};
		System.out.println("Multi dimentional array :");
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
