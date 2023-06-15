package UsageofDataDrivenTesting;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws IOException  {
	//converting excel data into stream of bytes and store it in fis ref variable
	FileInputStream fis = new FileInputStream("./data/testscript.xlsx");	
	//creating an object of workbook(I) by using create present in workBookFactory class
	//it will create an object and also store data into that object
	Workbook wb = WorkbookFactory.create(fis);
	//with the object reference first we will fetch the sheet then we fetch the row then
	//we need to fetch cell then we will specify which data to be retrieved 
	String data = wb.getSheet("InvalidLogin").getRow(4).getCell(1).getStringCellValue();
	System.out.println(data);
	//to access numbers
	int data1 = (int)wb.getSheet("InvalidLogin").getRow(3).getCell(1).getNumericCellValue();
	System.out.println(data1);
	
	}

}
