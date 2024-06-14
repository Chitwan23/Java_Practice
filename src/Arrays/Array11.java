package Arrays;
import java.util.*;
//Consider an integer array, the number of elements in which is determined by the user. 
//The elements are also taken as input from the user. 
//Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
public class Array11 {
	public static void main(String args[])
	{Scanner sc =new Scanner (System.in);
	System.out.println("Enter the size of the array : ");
	int size = sc.nextInt();
	int num []= new int [size];
	System.out.println("Enter the elements of the array : ");
	for(int i =0 ; i <size ; i++) {
		num[i]=sc.nextInt();
	}
	
	Arrays.sort(num);
	
	int min = ( num[0]- num[1]);
	int max =( num[size-1]- num[0]) ;
	
	System.out.println("The minimum difference is : " +min);
	System.out.println("The minimum difference is : " +max);
//	int x = 0;

//int largest =0;
//int smallest =0;
//int secsmallest=0;
//	for (int i =0; i<size; i++) {
//		if (num[i]>largest) {
//			largest = num[i];
//		}
//		else if (num[i]<smallest) {
//			smallest = num[i];
//		}
//		
//	}
//	
		
	}
}
