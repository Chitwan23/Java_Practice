package Arrays2D;

import java.util.Scanner;

public class Array1{
	public static void main ( String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the no. of rows: ");
		int rows =sc.nextInt();
		System.out.print("Enter the no. of columns: ");
		int columns=sc.nextInt();
		int [][]num=new int [rows][columns];
		//input
		System.out.println("Enter the data to be stored: ");
		for (int i=0; i<rows;i++) {
			for (int j = 0; j<columns; j ++) {
				num[i][j]=sc.nextInt();
			}
		}
		//output
    System.out.print("Data entered: ");
		for (int i=0; i<rows;i++) {
			for (int j = 0; j<columns; j ++) {
				System.out.print(num[i][j] +" ");
						}		System.out.println();
	}}}