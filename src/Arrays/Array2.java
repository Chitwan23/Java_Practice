package Arrays;
import java.util.*;
public class Array2 {
	//Linear Search

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size of the array : ");
		int size =sc.nextInt();
		int marks[]= new int [size];
		System.out.println("Enter the elements of the array : ");
		for (int i =0; i<size; i++) {
			marks [i]=sc.nextInt();
		}
		System.out.print("Enter the value you want to search : ");
		int x =sc.nextInt();
		for (int i =0; i <size; i++) {
			if (marks[i]==x) {
				System.out.println("Index of the element x is : "+i);
			}
			}
		
	}

}
