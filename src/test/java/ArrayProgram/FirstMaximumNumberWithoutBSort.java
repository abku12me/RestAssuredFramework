package ArrayProgram;

public class FirstMaximumNumberWithoutBSort {
	
	
	
	
public static void main(String[] args) {
		
		int arr[]= {4,3,0,1,5};
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}
		
		System.out.println(max);

}

}
