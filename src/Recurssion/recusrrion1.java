package Recurssion;
import java.util.*;
public class recusrrion1{
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     prnt(n);
	}
	public static void prnt (int n) {
		if (n>5) {return;
			}
		System.out.println(n);
		prnt(n+1);
		}
	}