package Arrays;
//Write a program to find the sum and product of all elements of an array.
import java.util.*;
public class Array7{
	public static void main(String args[]) {
	  Scanner sc  = new Scanner (System.in);
	  System.out.println("Enter the size of the array : ");
	    int size = sc.nextInt();
		int [] num = new int [size];
		//input
		System.out.println("Enter the elements of the array : ");
		for (int i =0; i<size; i++) {
			num[i]= sc.nextInt();
		}
		int sum = 0;
		for (int i =0; i<size; i++) {
			sum =num[i]+sum;
		}
		System.out.println("Sum of elements of the array : "+sum);
		int product = 1;
		for (int i =0; i<size; i++) {
			product =num[i]*product;
		}System.out.println("Product of elements of the array : "+product);
		}
}
