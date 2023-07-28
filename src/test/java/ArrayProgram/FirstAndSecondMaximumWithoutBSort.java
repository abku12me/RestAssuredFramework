package ArrayProgram;

public class FirstAndSecondMaximumWithoutBSort {
	
	
	public static void main(String[] args) {
		
		int arr[]= {3,0,2,1};
		int fmax=arr[0];
		int smax=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=fmax)
			{
				if(arr[i]!=fmax)
				{
					smax=fmax;
				}
				fmax=arr[i];
			}
			
			else if(smax==fmax || smax>arr[i])
			{
				smax=arr[i];
			}
			
		}
		
		System.out.println("fmin="+fmax);
		System.out.println("smin="+smax);
			
		}
		
		
		
		
		
		
		
	

}
