package BitManipulation;

import java.util.Scanner;

public class Setbit {

	public static void main(String[] args) {

		Scanner  sc  = new Scanner(System.in);
		System.out.println("Enter the position need to set : ");
		int pos = sc.nextInt();
		System.out.println("Enter the n  : ");
		 int n = sc.nextInt();
		 int bitmask =  1<<pos;
		 int newnum =(bitmask | n);
		 System.out.println( newnum);
	 
	}

}
