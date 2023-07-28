package StringProgram;

public class ReverseStr {
	
	
	public static void main(String[] args) {
		
		String str="i am a boy";
		String[] s = str.split("\\s+");// using s is the function
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
			
		}
		
		
		
		
		
	}

}
