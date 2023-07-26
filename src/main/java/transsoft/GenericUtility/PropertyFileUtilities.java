package transsoft.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class will provide generic method related to property file
 * @author mishr
 *
 */

public class PropertyFileUtilities {

	/**
	 * This method will read the data from the property file
	 * @param propertypath
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
    public String readDataFromPropertyFile(String propertypath,String key) throws IOException
  {
	  FileInputStream fis=new FileInputStream(propertypath);
	  Properties pobj=new Properties();
	  pobj.load(fis);
	  String value=pobj.getProperty(key);
	  return value;
  }
	
	
	
	
	
	
	
	
	
	
}
