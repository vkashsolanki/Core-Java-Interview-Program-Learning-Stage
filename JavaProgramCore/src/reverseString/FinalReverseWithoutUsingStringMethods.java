package reverseString;


//  Write a Java Program to reverse a string without using String inbuilt function.
public class FinalReverseWithoutUsingStringMethods {

	public static void main(String[] args) {


		String str= "Automation";
		
		StringBuilder sb= new StringBuilder();
		sb.append(str);
		
		sb = sb.reverse();
		
		System.out.println(sb);
		
		

	}

}
