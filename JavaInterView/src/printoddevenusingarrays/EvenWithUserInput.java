package printoddevenusingarrays;

import java.util.Scanner;

public class EvenWithUserInput {	
	
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the even number");
		int s1 = sc.nextInt();
		
			if(s1 % 2 == 0) {
				System.out.println("Even number");
			}else
			{
				System.out.println("odd number");
			}

	  
	}
	
}


