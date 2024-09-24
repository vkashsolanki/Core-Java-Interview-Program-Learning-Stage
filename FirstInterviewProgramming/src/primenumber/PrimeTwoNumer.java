package primenumber;

import java.util.Scanner;

public class PrimeTwoNumer {
	
	
	
	static boolean isPrime(int n) {
		
		if(n <= 1) {
			return false;
			
		}
		
		for(int i = 2; i<= Math.sqrt(n); i++) {
			if(n % i == 0 ) {
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int start = scanner.nextInt();
		System.out.println("Enter the seocnd numer");
		int end = scanner.nextInt();
		
		System.out.println(" "+start+ " "+end);
		
		for(int i = start; i<=end; i++) {
			
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
		
		
	}

}
