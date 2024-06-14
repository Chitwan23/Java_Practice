package practice;
import java.util.*;
public class Fibonacciwithrecur {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		 System.out.println("The " + n + "th Fibonacci number is: " + Recurssion(n));
	}
	public static int Recurssion(int n ) {
		if (n<2) {
			return n ;
		}
		 return Recurssion(n-1)+Recurssion(n-2);
		
	}

}
