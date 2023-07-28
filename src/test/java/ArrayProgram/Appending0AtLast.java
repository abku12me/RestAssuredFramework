package ArrayProgram;

public class Appending0AtLast {
	
	public static void main(String[] args) {
		
	  int arr[]= {6,0,1,0,4};  //6 1 4 0 0 0
		
		
		int res[]=new int[arr.length];
		int x=0;
		int n=arr.length-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				res[x]=arr[i];
				x++;
			}
			else
			{
				 res[n]=arr[i];
				n--;
			}
			
		}
		
		
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
		
		
	}

}
