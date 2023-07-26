package Deserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojo.genericUtility.EmployeeDetailsWithArrays;
import pojo.genericUtility.EmployeeDetailsWithObject;

public class DesealizationOfEmployeeDetailsWithObject {
	
	
	
	public void desealizationOfEmployeeDetailsWithObject() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper obj=new ObjectMapper();
		
		// read the value from object mapper
		EmployeeDetailsWithObject e1 = obj.readValue(new File(".\\EmployeeDetailsWithObject.json"), EmployeeDetailsWithObject.class);
		
		//fetch the required value from the getter and  
		
		System.out.println(e1.getEmpid());
		e1.getClass();
		
		
		
	}

}
