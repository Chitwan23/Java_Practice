package Arrays;
import java.util.*;
public class Array3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the list of names");
		int size = sc.nextInt();
		String names[]=new String[size];
		System.out.println("Enter the names : ");
		for(int i =0; i<size; i ++) {
			names[i]=sc.next();
		}
		for(int i =0; i<size; i ++) {
			System.out.println("Name at index "+ (i+1) +" is : "+ names[i]);
		}
		
	}

}
