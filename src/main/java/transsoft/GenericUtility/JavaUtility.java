package transsoft.GenericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

/**
 * This class consist of generic method related to java
 * @author mishr
 *
 */
public class JavaUtility {
	
	/**
	 * This method will generate random number
	 * @return
	 */
	
	public int getRandom()
	{
		Random r=new Random();
		int random=r.nextInt(1000);
		return random;
	}
	
	/**
	 * This method will generate system date
	 * @return
	 */
	
	public String getSystemDate()
	{
		Date d=new Date();
		String sysdate=d.toString();
		return sysdate;
	}
	
	/**
	 * This method will generate the current date in the format of dd-MM-YYYY
	 * @return
	 */
	
	public String getSystemFormat()
	{
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
		String formatdate=sdf.format(d);
		return formatdate;
	}
	
	/**
	 * This method will genertae the date in the given format as month,date,year
	 * @return
	 */
	public String formatDate()
	{
		Date d=new Date();
		String date[]=d.toString().split(" ");
		String Date=date[1];
		String month=date[2];
		String year=date[3];
		String format=month+" "+Date+" "+year;
		return format;
		
	}
	
	/**
	 * This method will generate the future date based on given date in the form of MM/dd/YYYY 
	 * @param givendate
	 * @return
	 */
	
	public String getCalendarDate(int givendate)
	{
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR,givendate);
		Date currentdate=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY");
		String modifieddate=sdf.format(currentdate);
		return modifieddate;
	}
	
	

}
