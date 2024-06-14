package Recurssion;

public class recurssion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =10;
int i = 1;
int sum = 0;
psum(i,n,sum);

	}
	
	public static void psum (int i , int n , int sum ) {
		if (i ==n) {
			sum += i;
			System.out.println(sum);
			return;
		}
		sum += i;
		psum(i+1,n,sum);
		System.out.println(i);
	}
	}


