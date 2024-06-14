package Strings;
import java.util.*;
public class Stringbuilder {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		String sb[]=new String[4];
//		for (int i =0;i<sb.length; i++) {
//		}
		
		StringBuilder sb = new StringBuilder("Chitwan");
		for (int i = 0 ; i< sb.length()/2; i++) {
			 int fr = i;
			 int bk = sb.length()-1-i;
			char frchar = sb.charAt(fr);	
			char bkchar = sb.charAt(bk);
			
			sb.setCharAt(fr, bkchar);
			sb.setCharAt(bk, frchar);			 
		}
		System.out.print(sb);
	}

}
