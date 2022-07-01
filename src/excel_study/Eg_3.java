package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myfile = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
		
       Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
       
       for(int i=0; i<=3; i++)//static coding
       {
    	  System.out.print(mysheet.getRow(0).getCell(i).getStringCellValue()+" ");
       }
       System.out.println();
       //for count total no of row
       int totalrows = mysheet.getLastRowNum();
       int row = totalrows;
       System.out.println(row);
       
       //for count total no of column
       short totalcell = mysheet.getRow(0).getLastCellNum();
       int cell = totalcell-1;
       System.out.println(cell);
       
       //Dynamic coding
       for(int i=0; i<=row; i++)//to print row
       {
    	System.out.print(mysheet.getRow(i).getCell(0).getStringCellValue()+" ");
       }
       System.out.println();
       for(int i=0; i<=cell; i++)//to print cell
       {
    	  System.out.print(mysheet.getRow(0).getCell(i).getStringCellValue()+" ");
       }
       
       
       
       
	}

}
