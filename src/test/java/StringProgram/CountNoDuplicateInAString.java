package StringProgram;

import java.util.LinkedHashSet;

public class CountNoDuplicateInAString {
	
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
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" is in "+(i+1)+" position");
					break;
				}
			}
			
		}
			
		
		
	}

}
