package practice;
import java.util.*;
public class Circumference {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the radius of the circle: ");
		int radius = sc.nextInt();
		
		CircleCircumference(radius);
		
	}
	public static void CircleCircumference(int radius) {
		
		double  circumference = 2*3.14*radius;
		System.out.print("The cicumference of circle is : "+circumference);
		
	}

}
