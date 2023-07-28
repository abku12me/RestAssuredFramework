package ArrayProgram;

public class PrintCombinationOfNumber {
	
	public static void main(String[] args) {
		
		int arr[]= {3,4,8,9,6,5,7,2,9,2};
		//11
		//8 2
		// 7 4
		// 9 2
		
		for(int i=0;i<arr.length;i++)
		{
		    for(int j=i+1;j<arr.length;j++)
		    {
		    	if(arr[i]+arr[j]==11)
		    	{
//		    		if(arr[i]!=arr[j])	
		    		System.out.println(arr[i]+"and "+arr[j]);
		    		
		    		
		    	}
		    	
		    }
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
