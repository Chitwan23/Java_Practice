package practice;
import java.util.*;
public class CatandMouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the  position of Cat A : ");
		int x = sc.nextInt();
		System.out.println("Enter the  position of Cat B : ");
		int y = sc.nextInt();
		System.out.println("Enter the  position of Mouse : ");
		int z = sc.nextInt();
		System.out.println(prblm(x,y,z));
		}
	
		public static String prblm (int x , int y , int z) {
			int distA= z-x;
			int distB = z-y;
			if (distA> distB) {
				return"Cat B";	
			}
			else if (distB>distA) {
				return "Cat A";
			}
			else {
			 return "Mouse C";
			}
		}
		
		

	
}
