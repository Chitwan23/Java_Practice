package Arrays;
//Find largest and smallest elements of an array.
import java.util.*;
//Find largest and smallest elements of an array.
public class Array8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int num[]= new int [size];
		System.out.println("Enter the element of the array : ");
		
		for (int i =0; i <size ; i ++) {
			num[i]=sc.nextInt();
		}
		int  largest  = num[0];
		int smallest = num[0];
		System.out.println("lets find the smallest and largest...");
		for (int i =0; i <size ; i++) {
			if (num[i]>largest) {
				largest= num[i];
			}
		   if (num[i]<smallest) {
			   smallest =num[i];
		   }
		   
		}
		System.out.println("largest number  in array is : " +largest);
		   System.out.println("Smallest number  in array is : " +smallest);
		
		
	}

}
