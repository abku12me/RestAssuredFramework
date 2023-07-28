package ArrayProgram;

public class SumOfFirstThreeMinimumNumber {
	
	
	
	public static void main(String[] args) {
		
		int arr[]= {4,0,1,2};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		}
		
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=sum+arr[i];
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
