package Read_Write_File;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class in_Excel {
    File f_path = new File(System.getProperty("user.dir")+"\\ExcelFile\\Excel.xlsx");
    FileInputStream fis;
    XSSFWorkbook wb;

    public in_Excel() throws IOException {
        fis = new FileInputStream(f_path);
        wb = new XSSFWorkbook(fis);
    }

    public String Read_Cell(int num_sheet, int row, int cell) throws IOException {
        XSSFSheet sheet = wb.getSheetAt(num_sheet);
        String data = sheet.getRow(row).getCell(cell).getStringCellValue();
        return data;
    }

    public void Read_Column(int num_sheet, int cell){
        XSSFSheet sheet = wb.getSheetAt(num_sheet);
        for (int i=0;i<=3;i++){
        String[] data = new String[10];
            data[i] = sheet.getRow(i).getCell(cell).getStringCellValue();
        }

    }
}
