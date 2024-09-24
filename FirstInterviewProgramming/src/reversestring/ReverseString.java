package reversestring;


//How do we reverse a string
public class ReverseString {
	
	// first approach 
 String reverse(String source) {
		
		if(source == null || source.isEmpty()) {
			return source;
			
		}
		String reverse ="";
		
		for(int i= source.length()-1; i>=0; i--) {
			reverse = reverse+source.charAt(i);
		}
		
		return reverse;
	}	

  
			public static void main(String[] args) {
				
				ReverseString s= new ReverseString();
				String reverse = s.reverse("ram");
				System.out.println(reverse);
				
			}


			
			
			
			

}

/*/ second approach 
 * 
 * public static void main(String[] args) {
 * 
 * String str = "Ram"; String reverse = new
 * StringBuffer(str).reverse().toString();
 * System.out.printf("Actual Word: %s, Word after reversing %s", str, reverse);
 * 
 * }
 * 
 */	
	
	


