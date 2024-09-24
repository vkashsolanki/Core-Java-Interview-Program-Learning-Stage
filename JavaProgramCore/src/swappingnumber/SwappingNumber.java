package swappingnumber;

import java.util.Scanner;

//Q #3) Write a Java Program to swap two numbers using the third variable
public class SwappingNumber {
	
	public static void main(String[] args) {
		int x, y, temp;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ehter the x y value");
		x= sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("Before swapping "+x+y);
		
		temp= x;	
		x=y;	
		y=temp;
		System.out.println("After swappign "+x+y);
		
		
		
		
	}

}
