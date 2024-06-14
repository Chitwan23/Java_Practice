package Arrays;
//Take an array of 10 elements. Split it into middle and store the elements in two dfferent arrays.
import java.util.*;
public class Array10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int num[]= new int [size];
		System.out.println("Enter the element of the array : ");
		for (int i =0; i <size ; i ++) {
			num[i]=sc.nextInt();
		}
		
		
		int num1[] = Arrays.copyOfRange(num, 0, size/2);	
		int num2[]=Arrays.copyOfRange(num, (size/2) , size);
		for (int i =0; i <num1.length; i ++) {
			System.out.print(num1[i] + " , ");
			
		}System.out.println();
		for (int i =0; i <num2.length; i ++) {
			System.out.print(num2[i]+ " , " );
			}
		
			}}
