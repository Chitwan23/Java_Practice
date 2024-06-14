package practice;
import java.util.*;
public class Eligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the age of person: ");
		int age = sc.nextInt();
		
		Vote(age);

	}
	public static void Vote(int age) {
		if (age>18) {
			System.out.println("Hurrah! Person is eligible to vote .");
		}
		else {
			System.out.println("Sorry! Person is not eligible to vote .");
		}
		
	}

}
