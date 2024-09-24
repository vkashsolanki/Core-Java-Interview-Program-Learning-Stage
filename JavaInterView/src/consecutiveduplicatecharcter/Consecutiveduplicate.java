package consecutiveduplicatecharcter;

import java.util.*;   

public class Consecutiveduplicate {

	static void removeDuplicate(char str[], int length) {
		// creating index to use modify string
		int index = 0;

		// traverse character array char s[]
		for(int i = 0; i < length; i++) {

			// Check whether str[i] is present before or not
			int j;

			for(j = 0; j < i; j++) {
				
				   // Check whether str[i] is present before or not 
				if (str[i] == str[j]) {
					break;
				}

			}

			if(j == i) {
				str[index++] = str[i];
			}

		}
		System.out.println("this is ::"+String.valueOf(Arrays.copyOf(str, index)));

	}

	public static void main(String[] args) {

		String ss = "AAAAMMMMSSRRRTTTUUU";

		// Converting string to character array
		char s1[] = ss.toCharArray();
		// Calculating length of the character array
		int len = s1.length;
		//Calling removeDuplicates() method to remove duplicate characters  
		removeDuplicate(s1, len);
	}
}
