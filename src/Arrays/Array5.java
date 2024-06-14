package Arrays;

import java.util.Scanner;

public class Array5 {
	public static void main ( String args[]) {
		Scanner sc = new Scanner (System.in);
		int size =sc.nextInt();
		int []num=new int [size];
		System.out.println("Enter the num : ");
		
		for(int i =0; i<size; i ++) {
		num[i]	=sc.nextInt();
		}
		
		boolean asc = true;
		
		for(int i =0; i<size-1; i ++) {
		if (num[i]>num[i+1]) {
			asc =false;
		}	
		}
		if (asc) {
				System.out.println("Numbers are in ascending order");
			}
		else {
			System.out.println("Numbers are not in ascending order");
		}
		
	}
}