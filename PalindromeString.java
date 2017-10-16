package JavaImportantPrograms;
import java.util.*;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String original,reverse="";
         Scanner in = new Scanner(System.in);
         
         System.out.println("Enter the line: ");
         original=in.nextLine();
         
         int length=original.length();
         
         for(int i=length-1;i>=0;i--)
        	 reverse=reverse+original.charAt(i);
         
         if(original.equals(reverse))
        	 System.out.println("Result: PALINDROME STRING");
         else
        	 System.out.println("Result: NOT PALINDROME STRING");
         
         
	}

}
