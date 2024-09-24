package Fibonacciseries;


//Fibonacci Series using recursion in java
public class FibonacciSeriesRecursion {

	static int n1 = 0;	
	static int n2 = 1;
	static int n3 = 0;
	
	static void printFibonacci(int count) {
		
		if(count>0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
			System.out.print(" " +n3);
			
			printFibonacci(count-1);
			
		}
	}

	
	
	public static void main(String[] args) {
		int count = 10;
		System.out.println("Both printing "+ n1+" "+n2);
		//n-2 because 2 numbers are already printed 
		printFibonacci(count-2); 
		
		
		
		
	}

}
