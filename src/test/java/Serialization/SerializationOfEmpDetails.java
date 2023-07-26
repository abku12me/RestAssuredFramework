package Serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo.genericUtility.EmployeeDetails;

public class SerializationOfEmpDetails {
	
	
	@Test
	public void serializationOfEmpDetails() throws JsonGenerationException, JsonMappingException, IOException
	{
		//step 1: create the object of pojo class
		
		EmployeeDetails emp=new EmployeeDetails("Abhishek","TY098","4567","abc@113");
		
		// step 2: create object for object mapper
		
		ObjectMapper objM=new ObjectMapper();// from jackson
		
		// step 3: write the value to the json file
		objM.writeValue(new File("./EmployeeDetails.json"),emp);
		
		
	}
	

}
