package compalindrome;

import java.util.Scanner;
// jiske rever krne par same number aaye 121 .. 121
public class Palindromes {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enther the number ");
		int number = sc.nextInt();
		
		int temp = number ;
		int reverse = 0;
		int reminder;
		// doing reversing here
		while (temp !=0) {
			
			reminder = temp % 10;
			reverse = reverse * 10 + reminder;
			temp = temp / 10;
			
		}
		
		if(number==reverse) {
			System.out.println("Palindrome number");
		}else
		{
			System.out.println("Not Palindrome number");
		}
		
	}
	
	
	
	
	
	
	
}
	
	// jiske rever krne par same number aaye 121 .. 121 
	
	

