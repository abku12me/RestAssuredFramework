package transsoft.GenericUtility;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

/**
 * This class will provide generic method related to rest assured
 * @author mishr
 *
 */
public class RestAssuredUtilities {
	
	/**
	 * This method will capture the json path from the response
	 * @param resp
	 * @param jsonPath
	 * @return
	 */
	public String captureResponse(Response resp,String jsonPath)
	{
		String path=resp.jsonPath().get(jsonPath);
		return path;	
	}
	
	
	
	
	

}
