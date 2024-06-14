package practice;
import java.util.*;
public class Fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print(" Enter the value : ");
		int n = sc.nextInt();
		Series(n);
		}
	public static void Series(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " ");
		System.out.print(n2);
		for (int i=2;i <=n; i++) {
		int n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.print( n3 +" ");
			
		}
		
	}
			
}
