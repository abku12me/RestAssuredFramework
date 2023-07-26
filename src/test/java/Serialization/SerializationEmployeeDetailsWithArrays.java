package Serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo.genericUtility.EmployeeDetailsWithArrays;

public class SerializationEmployeeDetailsWithArrays {
	@Test
	public void serializationEmployeeDetailsWithArray() throws JsonGenerationException, JsonMappingException, IOException
	{
	
	//step 1: create the object of pojo class
	
	int[] phnos= {123,2345};
	String[] emails= {"abc","123@23"};
	
	EmployeeDetailsWithArrays emp=new EmployeeDetailsWithArrays("Abhishek","rt45",phnos,emails);
	
	// step 2: create object for object mapper
	
			ObjectMapper objM=new ObjectMapper();// from jackson
			
			// step 3: write the value to the json file
			objM.writeValue(new File("./EmployeeDetailsWithArrays.json"),emp);

}
}
