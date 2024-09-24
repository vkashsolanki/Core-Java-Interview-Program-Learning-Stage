package powertwointegervalue;

import java.util.Scanner;

public class FindThePower {
	// find the power power(a,b)
	
	public static void main(String[] args) {
	
		
		Scanner s= new Scanner(System.in);
		int b= s.nextInt();
		int p = s.nextInt();
		int power = power(b,p);
		
		System.out.println("base value is : "+b +" power value is  : " +p);
		System.out.println(power);
		
	}

	private static int power(int b, int p) {
		
		int power=1;
		
		for(int i =1; i<=p; i++){
		  power = power*b;
			
		  // System.out.println(power);
		}
		
		return power;
	}

}
