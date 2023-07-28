package ArrayProgram;

public class FirstMinimumNumberWithoutBSort {
	
	
	public static void main(String[] args) {
		
		int arr[]= {4,3,0,1};
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			
		}
		
		System.out.println(min);
		
		
		
		
	}

}
