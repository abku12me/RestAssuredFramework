package StringProgram;

public class ReverseAStringInSameOrder {
	
	public static void main(String[] args) {
		String st="i am a boy";
		String[] s = st.split("\\s+");
		for(int i=0;i<s.length;i++)
		{
			String str=s[i];
			
			for(int j=str.length()-1;j>=0;j--)
			{
				System.out.println(str.charAt(j));
				
			}
			System.out.println(" ");
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
