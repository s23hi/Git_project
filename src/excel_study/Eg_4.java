package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile =new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		//read total sheet
		 for(int i=0; i<=5; i++)//for row
		 {
			 for(int j=0; j<=3; j++)//for column
			 {
				System.out.print(mysheet.getRow(i).getCell(j).getStringCellValue()+" ");
			 }
			 System.out.println();
		 }
		 System.out.println("--------------------------------------");
		  int totalrow = mysheet.getLastRowNum();
          int row = totalrow;
          short totalcell = mysheet.getRow(0).getLastCellNum();
          int cell = totalcell -1;
        for(int i=0; i<=row; i++)
        {
        	for(int j=0; j<=cell; j++)
        	{
        		String table = mysheet.getRow(i).getCell(j).getStringCellValue();
        		System.out.print(table+" ");
        	}
        	System.out.println();
        }
	}

}
