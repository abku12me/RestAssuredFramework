package StringProgram;

public class RemoveSpaceBtwString {
	
	public static void main(String[] args) {
		
		String str="i am a boy";
		String[] s = str.split("\\s+");// using s is the function
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
			
		}
		
		
		
	}

}
