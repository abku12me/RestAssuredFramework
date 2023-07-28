package StringProgram;

import java.util.LinkedHashSet;

public class CountVowelUsingLinkedHashSetWithoutDuplicates {
	
	
	
	public static void main(String[] args) {
		String str="India";
		String s=str.toLowerCase();
		char[]ch=str.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(ch[i]);		
		}
		int count=0;
		for(Character c:set)
		{
			if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
			{
				count++;
				System.out.println();
			}
			
			
		}
		
		
		
		
		
		
		
	}
	

}
