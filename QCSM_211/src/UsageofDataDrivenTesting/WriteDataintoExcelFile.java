package UsageofDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataintoExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		//converting excel data into stream of bytes and store it in fis ref variable
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");	
		//creating an object of workbook(I) by using create present in workBookFactory class
		//it will create an object and also store data into that object
		Workbook wb = WorkbookFactory.create(fis);
		//with the object reference first we will fetch the sheet then we fetch the row then
		//we need to fetch cell then we will specify which data to be retrieved 
	     wb.getSheet("InvalidLogin").getRow(2).getCell(1).setCellValue("virat");
	     //in order to convert  stream of bytes create an object of FileOutputStream
	     FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");	
	     // in order to write data pass fos reference for write() in workbook interface
	     wb.write(fos);
	     wb.close();
		
		}
	
}
