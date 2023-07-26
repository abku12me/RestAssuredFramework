package Deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo.genericUtility.EmployeeDetails;

public class DesealizationOFEmployeeDetails {
	
	
	
	@Test
	public void desealizationOFEmployeeDetails() throws JsonParseException, JsonMappingException, IOException
	{
		
		//create the object of object Mapper class
		
		ObjectMapper obj=new ObjectMapper();
		
		// read the value from object mapper
		EmployeeDetails e1 = obj.readValue(new File("./EmployeeDetails.json"), EmployeeDetails.class);
		
		//fetch the required value from the getter and  
		
		System.out.println(e1.getEname());
		e1.getClass();
		
	}

}
