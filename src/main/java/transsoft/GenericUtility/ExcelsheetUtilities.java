package transsoft.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class will provide the generic method related to excel sheet
 * @author mishr
 *
 */
public class ExcelsheetUtilities {

	
	
	/**
	 * This method will fetch the multiple data from the excel sheet
	 * @param sheetname
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public Object[][] getMultipleData(String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	     Sheet sh=wb.getSheet(sheetname);
	     int lastrownum=sh.getLastRowNum();
	     int lastcellnum=sh.getRow(0).getLastCellNum();
	     
	     Object[][] data=new Object[lastrownum][lastcellnum];
	     
	     for(int i=0;i<lastrownum;i++)
	     {
	    	 for(int j=0;j<lastcellnum;j++)
	    	 {
	    	       data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue(); 
	    	 } 
	    	 	 
	     }
	     return data;
	}
	
	
	/**
	 * This method will read the data from the excel sheet
	 * @param excelpath
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcelsheet(String excelpath,String sheetname,int rownum ,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
