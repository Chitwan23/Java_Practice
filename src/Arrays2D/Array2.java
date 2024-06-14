package Arrays2D;
import java.util.Scanner;

//find the element and print the address

public class Array2{
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
    System.out.print("Enter data to be searched: ");
     int x =sc.nextInt();
		for (int i=0; i<rows;i++) {
			for (int j=0; j<columns; j++) {
				if(num[i][j]==x) {
					System.out.println("Value found at the index : " + i  + j);					
					
				}
						}
	}}}