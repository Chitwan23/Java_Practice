package practice;
//returns greater of two
import java.util.*;
public class Greaterof {
	public static void main(String args[])
	{Scanner sc = new  Scanner (System.in);
	System.out.print("Enter the number1: ");
      int a = sc.nextInt();
    System.out.print("Enter the number2: ");
      int b = sc.nextInt();
      
      Greater(a,b);
      
	}
	
	public static void Greater(int a, int b ) {
		if (a>b) {
			System.out.println("The greater of two is number1:  "+ a);
		}
		else {System.out.println("The greater of two is number2:  "+ b);
			
		}
		
	}

}
