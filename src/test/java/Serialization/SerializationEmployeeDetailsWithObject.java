package Serialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo.genericUtility.EmployeeDetailsWithObject;
import pojo.genericUtility.spouse;

public class SerializationEmployeeDetailsWithObject {
	@Test
	public void serializationEmployeeDetailsWithObject() throws JsonGenerationException, JsonMappingException, IOException
	{
	
	//create the object of pojo class
	
	int[] phno= {345,456};
	String[] email= {"avb#12","abc@we"};
	spouse sp=new spouse("abh","tyss",34);
	
	
	EmployeeDetailsWithObject emp=new EmployeeDetailsWithObject("avc","id23",phno,sp);
	
	// step 2: create object for object mapper
	
			ObjectMapper objM=new ObjectMapper();// from jackson
			
			// step 3: write the value to the json file
			objM.writeValue(new File("./EmployeeDetailsWithObject.json"),emp);
			
	}

}
