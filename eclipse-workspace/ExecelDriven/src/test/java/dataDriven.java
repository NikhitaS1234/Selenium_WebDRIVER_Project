import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public ArrayList<String> getData(String TestcaseName) throws IOException
	{
		ArrayList<String> a=new ArrayList<String>();
        FileInputStream fis=new FileInputStream("C:\\Users\\Dell\\Documents\\DataforSelenium.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int sheets =workbook.getNumberOfSheets();
				for(int i=0;i<sheets;i++)
				{
					if(workbook.getSheetName(i).equalsIgnoreCase("samp0"))
					{
					XSSFSheet sheet=workbook.getSheetAt(i);
					
					Iterator<Row> rows=sheet.rowIterator();
					Row firstrow=rows.next();
					Iterator<Cell> ce=firstrow.cellIterator();
					int k=0;
					int column = 0;
					while(ce.hasNext())
					{
						Cell value=ce.next();
					   if( value.getStringCellValue().equalsIgnoreCase("Testcases"))
					   {
						   column=k;
					   }
					   k++;
					}
					System.out.println(column);
					while(rows.hasNext())
					{
						Row r=rows.next();
						if(r.getCell(column).getStringCellValue().equalsIgnoreCase(TestcaseName))
						{
							Iterator<Cell> cv=r.cellIterator();
							while(cv.hasNext())
							{
							a.add(cv.next().getStringCellValue());//send data to arraylist					
							}
						}
						
					}
					}
					
				}
				return a;
					
				
		
	}

	public static void main(String[] args) throws IOException {

		
		
		
}
	}
