package ArrayProgram;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SwapNumberWithoutThirdVariable {
	
	
	
	
	public static void main(String[] args) {
		
		int a=9;
		int b=10;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" "+a);
		System.out.println(" "+b);
		
	}

}
