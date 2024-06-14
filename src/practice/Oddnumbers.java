package practice;
import java .util.*;
public class Oddnumbers {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		System.out.println("Sum of odd numbers till n: "+Sum(n));	
	}
	public static int Sum(int n) {
		int count= 0;
		for (int i = 1; i<=n; i=i+2) {
				count = i+count;
			}
			return count;	
		}
	}
