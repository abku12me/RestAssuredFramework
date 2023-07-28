package ArrayProgram;

public class FirstMaximumElementInArrayUsingBubbleSort {
	
	
	public static void main(String[] args) {
		
		int arr[]= {4,1,3,0,5};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
			
		}
		
		System.out.println("first maximum element"+arr[0]);
		
		
//		for(int i=0;i<arr.length;i++)
//		{
//			
//			System.out.println(arr[0]);
//			
//		}
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
