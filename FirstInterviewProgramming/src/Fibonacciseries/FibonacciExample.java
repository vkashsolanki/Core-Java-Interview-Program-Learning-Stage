package Fibonacciseries;
/*
In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

There are two ways to write the fibonacci series program in java:

Fibonacci Series without using recursion
Fibonacci Series using recursion*/


//Fibonacci Series in Java without using recursion
// like pichle number se add hoga like 0 1 1 2 3 5 8 13 piche number se add hoga 13+8 hoga fir 
public class FibonacciExample {

	public static void main(String[] args) {
		int s1 = 0;
		int s2 = 1;
		
		int  s3;
		int i;
		int count = 10;
		
		System.out.println("local variable print main method =>> "+s1+" : :  "+s2);
		
		//loop starts from 2 because 0 and 1 are already printed    
		for(i =2; i < count; ++i) {
			s3 = s1+s2;
			System.out.println("The s3 is : "+s3);
			
			s1=s2;
			s2=s3;
			
		}
		
		
	}
	

}
