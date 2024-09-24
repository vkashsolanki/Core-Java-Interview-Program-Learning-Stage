package squrerootnumber;

import java.util.Scanner;

//Write a program to find the square root of a number.
public class SqueareRootNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("Input the number to find square root ");
		double first = sc.nextDouble();

		double sqrt = Math.sqrt(first);

		System.out.println("Square root is :: " + sqrt);

	}

}
