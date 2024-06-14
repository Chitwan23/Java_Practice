package BitManipulation;

import java.util.Scanner;

public class Getbit{
	  public static void main(String args[]) {
		 Scanner  sc  = new Scanner(System.in);
		 int pos = sc.nextInt();
		 int n = sc.nextInt();
		 int bitmask =  1<<pos;
		  if ((bitmask & n)==0) {
			  System.out.println("bit was zero");
		  }
		  
		  else {
			  System.out.println("Bit was one ");
		  }
		  
	  }
 }