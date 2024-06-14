package Arrays;
//Write a program to check if elements of an array are same or not it read from front or back.
//basically checks if it s pallindrome or not 
import java.util.*;
public class Array9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
	int size =sc.nextInt();
	int []num=new int [size];
	System.out.println("Enter the num : ");
	
	for(int i =0; i<size; i ++) {
		num[i]=sc.nextInt();
	
	}
	boolean check = false;
	
	for (int i =0; i <size/2; i ++)
	{
		if (num[i]==num[size-1-i]) {
			check =true;
			break;
		}
		
	}System.out.print(check);
	
	}
}
