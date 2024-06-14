package Strings;
import java.util.*;
public class Strings1{
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		String name = sc.nextLine();
		String lastname =sc.next();
		//concatenation
		String fullname = (name + lastname);
		System.out.println(fullname);
		System.out.println(fullname.length());
		System.out.println(name.charAt(1));
		
		if (name.compareTo(lastname)>0) {
			System.out.println("name string  is greater than last name");
		}
		else if (name.compareTo(lastname)<0){
			System.out.println("name string  is smaller than last name");
		}
		else {
			{
				System.out.println("name string is equal to last name");
			}
			
		}
		String sub = name.substring(3);
		System.out.println(sub);
		
	}
	
}