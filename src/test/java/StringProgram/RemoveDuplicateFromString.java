package StringProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {
	
	public static void main(String[] args) {
		
		
		String str="Testyantra";
		String s = str.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
		}
		
		for(Character ch:set)
		{
			System.out.print(ch+" ");
		}
		
		
		
		
		
		
		
		
		
	}

}
