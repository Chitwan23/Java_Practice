package Sorting;
import java.util.Scanner;
public class BubbleSort {
	//Linear Search

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size of the array : ");
		int size =sc.nextInt();
		int arr[]= new int [size];
		System.out.println("Enter the elements of the array : ");
		for (int i =0; i<size; i++) {
			arr [i]=sc.nextInt();
		}
		for (int i =0; i <arr.length-1; i ++) {
			for(int j =0; j<arr.length-1-i; j ++) {
				if (arr[j]>arr[j+1]) {
					int  temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					}
			}
		}
		System.out.println("Sorted Array:");
		for (int i = 0 ; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		}}