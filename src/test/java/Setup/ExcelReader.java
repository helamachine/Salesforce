package Setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	private XSSFWorkbook workBook;
	private XSSFSheet theSheet;

	public ExcelReader(String excelName) {
		try {
			InputStream ExcelFileToRead = new FileInputStream(
					System.getProperty("user.dir") + "/src/test/resources/testData/" + excelName + ".xlsx");
			this.workBook = new XSSFWorkbook(ExcelFileToRead);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.theSheet = workBook.getSheetAt(0);
	}

	public int getRowCount() {
		int rows = 0;
		try {
			rows = theSheet.getPhysicalNumberOfRows();

		} catch (Exception ex) {
			System.out.println(ex);
		}
		return rows;
	}

	/*
	 * public String getCellData(int row, int cell) { String
	 * data=theSheet.getRow(row).getCell(cell).toString(); return data; }
	 */

	public Object[][] getData() {
		int rows = getRowCount();
		int cells = theSheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rows - 1][cells];
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				XSSFCell value = theSheet.getRow(i).getCell(j);
				value.setCellType(CellType.STRING);
				data[i - 1][j] = value.toString();

			}
		}
		return data;
	}
}
