package StringProgram;

public class NonepeatingCjaracterInAString {
	
	public static void main(String[] args) {
		
		String str="developer";
		  char arr[]=str.toCharArray();
		  for(int i=0;i<arr.length;i++)
		  {
			  char c=str.charAt(i);
			  int count=0;
			  for(int j=0;j<arr.length;j++)
			  {
				  if(c==arr[j])
				  {
					  count++;
				  }
				  if(count>1)
					  continue;  
			  }
			  if(count==1)
			  System.out.println(c);
			  
			  
		  }
		
		
		
		
		
		
		
	}

}
