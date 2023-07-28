package StringProgram;

import java.util.Scanner;

public class PlaindromeString {
	
	
	public static void main(String[] args) {
		
//		String str="Racecar".toLowerCase();
//		String rev="";
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			char ch=str.charAt(i);
//			rev=rev+ch;
//		}
//		if(str.equals(rev))
//		{
//			System.out.println("It is palindrome string");
//		}
//		else
//			System.out.println("It is not a  palindrome string");	
		
		
		
		for(;;)
		{
		   Scanner sc=new Scanner(System.in);
		      String str=sc.next();
		      String rev="";
		      
		      for(int i=str.length()-1;i>=0;i--)
	  		{
	  			char ch=str.charAt(i);
	  			rev=rev+ch;
	  		}
	  		if(str.equals(rev))
		  		{
		  			System.out.println("It is palindrome string");
		  		}
	  		else
		  			System.out.println("It is not a  palindrome string");
		
		
		}
		
		
	}
	
	
	
	
	

}
