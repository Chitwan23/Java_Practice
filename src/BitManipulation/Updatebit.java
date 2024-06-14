package BitManipulation;

import java.util.Scanner;

public class Updatebit {
	public static void main(String[] args) {
		Scanner  sc  = new Scanner(System.in);
		System.out.println("Enter the position need to set : ");
		int pos = sc.nextInt();
		System.out.println("Enter the n  : ");
		 int n = sc.nextInt();
		 System.out.println("Enter the change to : ");
		 int chng = sc.nextInt();
		 int bitmask =  1<<pos;
		 
		 if (chng == 1) {
			  int newnum = (bitmask | n);
			  System.out.println(newnum);
		 }
		 else if (chng == 0){
			 int bitmasknot =~bitmask;
			  int newnum = (bitmasknot & n);
			  System.out.println(newnum);
		 }
		 else {
			  System.out.println("input not valid");
		 }
		 

}}
