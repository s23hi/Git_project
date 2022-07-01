package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile=new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		Row row = mysheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType type = cell.getCellType();
		System.out.println(type);
	    String text = cell.getStringCellValue();
	    System.out.println(text);
		

	}

}
