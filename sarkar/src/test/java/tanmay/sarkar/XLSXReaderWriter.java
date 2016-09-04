package tanmay.sarkar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;




public class XLSXReaderWriter {

	@Test
	public void write() throws IOException{
		XSSFWorkbook book = new XSSFWorkbook(); 
        XSSFSheet sheet = book.createSheet("Sheet Name");

        int rownum = sheet.getLastRowNum();
        Row row = sheet.createRow(rownum++);
        row.createCell(0).setCellValue("AAA");
        row.createCell(1).setCellValue("BBB");
        
        FileOutputStream out = new FileOutputStream(new File("Writesheet.xlsx"));
        book.write(out);
        out.close();
        book.close();
        System.out.println("Writing on Excel file Finished ...");

	}
}
