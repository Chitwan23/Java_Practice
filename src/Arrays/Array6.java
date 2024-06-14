package Arrays;
import java.util.*;
public class Array6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt();
			int [] marks = new int [size];
			//input
			for (int i =0; i<size; i++) {
				marks[i]= sc.nextInt();
				}
			int newmarks[] =new int [size];
			
			for (int i =0; i<size; i++) {
				newmarks[size-1-i]=marks[i];
				}
			System.out.println("Reversed numbers");
			for (int i =0; i<size; i++)		{
				System.out.println(newmarks[i]);
			}
	}
}
