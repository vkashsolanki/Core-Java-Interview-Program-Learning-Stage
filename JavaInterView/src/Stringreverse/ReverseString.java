package Stringreverse;




public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String s = "Ram";
		
		char[] cs = s.toCharArray();
		
		for(int i = cs.length-1; i >= 0; i--) {
			System.out.println(cs[i]);
		}
		
	}

}
