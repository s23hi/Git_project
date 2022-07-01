package kiteAppUtility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClass 
{
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myfile= new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet6");
		String myvalue = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return myvalue;
	}
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(3);
		File des=new File("D:\\Users\\SUHANI\\velocity\\z Application\\Screenshot"+random+".png");
		FileHandler.copy(src, des);
	}

}
