package br.com.keeggo.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	private static XSSFCell cell;

	public void setExcelFile(String excelFilePath, String sheetName) {
		// Cria um objeto da classe File para abrir o arquivo xlsx
		File file = new File(excelFilePath);

		// Cria um objeto da classe FileInputStream para ler o arquivo excel
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(file);

			// Criando instância da pasta de trabalho que se refere ao arquivo .xlsx
			wb = new XSSFWorkbook(inputStream);

			// criando um objeto de folha
			sheet = wb.getSheet(sheetName);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getCellData(int rowNumber, int cellNumber) {
		// obtendo o valor da célula de rowNumber e cell Number
		cell = sheet.getRow(rowNumber).getCell(cellNumber);
		return cell.getStringCellValue();
	}

	public int getRowCountInSheet() {
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		return rowcount;
	}

	public void setCellValue(int rowNum, int cellNum, String cellValue, String excelFilePath) throws IOException {
		// criando uma nova célula na linha e definindo valor para ela
		sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);

		FileOutputStream outputStream = new FileOutputStream(excelFilePath);
		wb.write(outputStream);
	}
}
