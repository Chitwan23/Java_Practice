package BitManipulation;

import java.util.Scanner;

public class Clearbit {

	public static void main(String[] args) {
		Scanner  sc  = new Scanner(System.in);
		System.out.println("Enter the position need to set : ");
		int pos = sc.nextInt();
		System.out.println("Enter the n  : ");
		 int n = sc.nextInt();
		 int bitmask =  1<<pos;
		 int bitmasknot =~bitmask;
		 int clearbit = bitmasknot & n;
		 System.out.println(clearbit);
		 
	}

}
