package compalindrome;

import java.util.Scanner;

public class SecondExample {

	
	public static void main(String[] args) {
		
		String reverse = "";
		String original = "";
			
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Polidrome number");
		 original = sc.nextLine();
		
		int length = original.length();
		
		for (int i = length-1;  i >= 0; i--) 
			
			reverse =reverse +  original.charAt(i);
			if(original.equals(reverse))
			
				System.out.println("Palindrome number");
			
			else
			
				System.out.println("Not Palindrome nubmer");
			
		
		
		
		
		
		
	
	}
}
