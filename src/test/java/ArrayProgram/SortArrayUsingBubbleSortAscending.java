package ArrayProgram;

public class SortArrayUsingBubbleSortAscending {
	
	
	public static void main(String[] args) {
		
		int[] arr= {4,1,3,5};
		int temp=0;
		//ascending order of array element
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])  ///arr[i]<arr[j]   for ascending order
				{
					temp=arr[i];
					arr[i]=arr[j];
				    arr[j]=temp;
				}
			}	
			
			System.out.println(arr[i]+",");
			
		}
		//printing the array element
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
		//descending order of array element
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		
		
	}
	
	

}
