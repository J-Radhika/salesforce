import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public static String salesdeskusername() throws IOException 
	{
		fis = new FileInputStream("C:\\Users\\J7900331\\eclipse-workspace\\Common\\TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Sheet1");
		String username= sheet.getRow(1).getCell(0).getStringCellValue();
		
		return username;
		
	}
	public static String bcoeusername() throws IOException 
	{
		fis = new FileInputStream("C:\\Users\\J7900331\\eclipse-workspace\\Common\\TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Sheet1");
		String bcoeusername= sheet.getRow(2).getCell(0).getStringCellValue();
		
		return bcoeusername;
		
	}
	public static String mleusername() throws IOException 
	{
		fis = new FileInputStream("C:\\Users\\J7900331\\eclipse-workspace\\Common\\TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Sheet1");
		String mleusername= sheet.getRow(3).getCell(0).getStringCellValue();
		
		return mleusername;
		
	}
	public static String password() throws IOException 
	{
		fis = new FileInputStream("C:\\Users\\J7900331\\eclipse-workspace\\Common\\TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Sheet1");
		String password= sheet.getRow(1).getCell(1).getStringCellValue();
		String carepassword= sheet.getRow(3).getCell(1).getStringCellValue();
		
		return password;
		
	}
	public static String carepassword() throws IOException 
	{
		fis = new FileInputStream("C:\\Users\\J7900331\\eclipse-workspace\\Common\\TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Sheet1");
		
		String carepassword= sheet.getRow(3).getCell(1).getStringCellValue();
		
		return carepassword;
		
	}
	public static String oppname() throws IOException 
	{
		fis = new FileInputStream("C:\\Users\\J7900331\\eclipse-workspace\\Common\\TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Sheet1");
		String opportunity= sheet.getRow(1).getCell(2).getStringCellValue();
		
		return opportunity;
		
	}
	public static String product() throws IOException 
	{
		fis = new FileInputStream("C:\\Users\\J7900331\\eclipse-workspace\\Common\\TestData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("Sheet1");
		String product= sheet.getRow(1).getCell(3).getStringCellValue();
		
		return product;
		
	}
	
	

}
