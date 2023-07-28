package ArrayProgram;

public class AdditionOfArrays {
	
	public static void main(String[] args) {
		
		
		int[] arr1= {2,1,3,5,2};
		int[] arr2= {4,5,1,2};
		
		int length=arr1.length;
		if(arr1.length<arr2.length)
		{
			length=arr2.length;
		}
		
		for(int i=0;i<length;i++)
		{
			try {
				System.out.println(arr1[i]+arr2[i]+" ");
			}
			catch(Exception e)
			{
				if(arr1.length<arr2.length)
				{
					System.out.println(arr2[i]);
				}
				else
				{
					System.out.println(arr1[i]);
				}
			}
			
			
			
		}
		
		
	}

}
