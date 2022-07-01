package kite_with_excel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\SUHANI\\velocity\\z Application\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myfile = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		String UserName = mysheet.getRow(0).getCell(0).getStringCellValue();
	    String PassWord = mysheet.getRow(0).getCell(1).getStringCellValue();
	    String Pin = mysheet.getRow(0).getCell(2).getStringCellValue();
	    
	    Login_page lp=new Login_page(driver);
	    lp.sendusername(UserName);
	    lp.sendpassword(PassWord);
	    lp.clickloginbutton();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Pin_page pp=new  Pin_page (driver);
	    pp.sendpin(Pin);
	    pp.clickbutton();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        Home_page hp=new  Home_page(driver);
	    hp.validateuserid(UserName);
	    hp.clickonloginbutton();

}
}
