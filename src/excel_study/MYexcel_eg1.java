package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MYexcel_eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
		String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
		 
		double no = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
         System.out.println(no);
         
        boolean cond = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(0).getBooleanCellValue();
        System.out.println(cond);
	}

}
