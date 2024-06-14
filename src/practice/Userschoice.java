package practice;
import java.util.*;
public class Userschoice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of input user wants : ");
		int size = sc.nextInt();
		 int number[] = new int [size];
	        for (int i =0; i<size; i++) {
	        	number[i]=sc.nextInt();
	        }
		
		returns( number);

	}
	
	public static void returns( int number[]) {
		   
		        int positive=0;
		        int negative=0;
		        int zeroes = 0;
		       
		       for ( int i=0; i<number.length;i++){
		         if (number[i]>=0)
		          positive++;     
		         
//		        else if(number[i]<0) 
//		       {negative++;}
//		         
//		        else{
//		        	zeroes++;
//		        }}
		         else
		             negative++;}
		       
		       for ( int i=0; i<number.length;i++) {
		    	   if (number[i]==0) {
		    		   zeroes++;
		    		   
		    	   }
		       }
		          System.out.println( "positive no. :" + positive);
		          System.out.println( "negative no. :"+ negative);
		          System.out.println("Among positive no. of zeroes: "+ zeroes);

		        
		        }
	}

