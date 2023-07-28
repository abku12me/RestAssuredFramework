package ArrayProgram;

public class FirstAndSecondMinimunWithoutBSort {
	
	
	public static void main(String[] args) {
		
		int arr[]= {3,0,2,1};
		int fmin=arr[0];
		int smin=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=fmin)
			{
				if(arr[i]!=fmin)
				{
					smin=fmin;
				}
				
				fmin=arr[i];
			}
			else if(smin==fmin || smin>arr[i])
			{
				smin=arr[i];
			}
			
		}
		
		System.out.println("fmin="+fmin);
		System.out.println("smin="+smin);
		
		
		
	}

}
