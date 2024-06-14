package practice;
import java.util.*;
public class Square {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of x :");
		int x = sc.nextInt();
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		Calculatesquare( x ,  n);

		
		
	}
	
	public static int Calculatesquare(int x , int n) {
		int square =1;
		for (int i = 1; i <=n; i++) {
			square = square * x;
			
		}
		System.out.print("The value  after operation: "+ square);
		return square;
	}

}
