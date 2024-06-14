package Recurssion;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= 0;
		int b =1;
		System.out.println(a);
		System.out.println(b);
        fact(n-2,a,b);
	}
	public static void fact(int n, int a,int b ) {
		if (n==0) {
			return;
		}
		int c = a+b;
		System.out.println(c);
		fact(n-1,b,c);
		 
		
		
		}}