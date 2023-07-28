package StringProgram;

public class CountVowelInString {
	
	
	
	public static void main(String[] args) {
		
		String str="India".toLowerCase();
		
		
		
		
		int vcount=0;
		int ccount=0;
		char ch;
		for(int i=0;i<str.length();i++)
		{
		   ch=str.charAt(i);
			
			switch(ch)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			vcount++;	
			}
		}
		
		System.out.println(vcount);
		
		
		
		
	}

}
