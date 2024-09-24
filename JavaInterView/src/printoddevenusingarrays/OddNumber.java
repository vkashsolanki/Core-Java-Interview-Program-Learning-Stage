package printoddevenusingarrays;

public class OddNumber {
	
	
	public static void main(String[] args) {
		 //data initlization 
		int[]  numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		// run loop form 0 to 10 and each loop check 
		for(int i=0;  i<numbers.length; i++ ) {
			// getting remainder of each element and checking if it is divided by 2 or not. If it is Not divided by 2, it is add number
		if(numbers[i] % 2 != 0) {
				System.out.println(numbers[i]);
			}
		}
		
		
	}

}
