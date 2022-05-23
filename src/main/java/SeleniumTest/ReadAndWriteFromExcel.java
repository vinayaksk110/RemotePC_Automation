package SeleniumTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteFromExcel {
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("..\\RemotePC_Automation1\\src\\main\\java\\ReadNWrite.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(3);//Ritesh row  Row starts from 0
		XSSFCell cell = row.getCell(0);
		System.out.println(cell);
		
		//write data to excel
		XSSFRow rowsave = sheet.getRow(4);
		XSSFCell cellsave = rowsave.createCell(4);
		cellsave.setCellValue("Updating the cell");
		FileOutputStream fos = new FileOutputStream("..\\RemotePC_Automation1\\src\\main\\java\\ReadNWrite.xlsx");
		wb.write(fos);
		fos.close();
		System.out.println(cellsave);
	}
	

}
