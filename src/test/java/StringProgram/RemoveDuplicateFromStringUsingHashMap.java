package StringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicateFromStringUsingHashMap {
	
	public static void main(String[] args) {
		
		String str="TestYantra";
		String s=str.toLowerCase();
		
		LinkedHashMap<Character,Object> map=new LinkedHashMap<Character,Object>();
		
		for(int i=0;i<s.length();i++)
		{
			map.put(s.charAt(i), i);
			
		}
		
		for(Entry<Character,Object> m:map.entrySet())
		{
			System.out.print(m.getKey());
			
			
		}
		
		
		
	}

}
