package StringProgram;

import java.util.LinkedHashSet;

public class StringOccurance {
	
	public static void main(String[] args) {
		
//		String str="Tester".toLowerCase();
//		
//	    char c;
//	    int count;
//	    while(str.length()>0)
//	    {
//	    	c=str.charAt(0);
//	    	count=str.length()-str.replace(c+"","").length();
//	    	System.out.println("occurance of"+c+"="+count);
//	    	str=str.replace(c+"","");
//	    	
//	    }
	
		String str="TestYantra";
		String s=str.toLowerCase();
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character c:set)
		{
			int count=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(c==s.charAt(i));
				{
					count++;
				}
			}
			System.out.println(c+"is repeated"+count+" times");
		}
		
		
		
		
		
		
		
	}

}
