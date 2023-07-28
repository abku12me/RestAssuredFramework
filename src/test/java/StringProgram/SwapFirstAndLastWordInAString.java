package StringProgram;

public class SwapFirstAndLastWordInAString {
	
	public static void main(String[] args) {
		
		
		String str="i am from bangalore";
		String[] st = str.split("\\s+");  //
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		for(int i=0;i<st.length;i++)
		{
			
			System.out.println(st[i]+" ");
			
		}
		
		
		
	}

}
