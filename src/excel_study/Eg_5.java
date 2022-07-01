package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg_5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File myfile = new File("D:\\Users\\SUHANI\\velocity\\z Application\\Myexcel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		
		int totalrows = mysheet.getLastRowNum(); 
		int totalcell = mysheet.getRow(0).getLastCellNum()-1;
		for(int i=0; i<=totalrows; i++)
		{
			for(int j=0; j<=totalcell; j++)
			{
				
			  Cell cell = mysheet.getRow(i).getCell(j);
		      CellType type = cell.getCellType();
		
		if(type==CellType.STRING)
		{
			System.out.print(cell.getStringCellValue()+" ");
		}
		else if(type==CellType.BLANK)
		{
			System.out.println("---");
		}
		else if(type==CellType.BOOLEAN)
		{
			System.out.print(cell.getBooleanCellValue()+" ");
		}
		else if(type==CellType.NUMERIC)
		{
			System.out.print(cell.getNumericCellValue()+" ");
		}
		
			}
			System.out.println();
		
			

	}
		}
}
	


