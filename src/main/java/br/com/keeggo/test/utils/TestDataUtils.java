package br.com.keeggo.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataUtils {

	private final static String local = "test-data//cadastro.xlsx";

	public static void main(String args[]) throws IOException {

		File file = new File(local);
		FileInputStream inputStream = new FileInputStream(file);

		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(inputStream);

		XSSFSheet sheet = wb.getSheet("CadastrarUsuario");

		// TRÁS O VALOR DE APENAS UMA CELULA

//		XSSFRow row = sheet.getRow(1);
//		
//		XSSFCell cell = row.getCell(4);
//		
//		String endereco = cell.getStringCellValue();
//		
//		System.out.println("O endereço é: " + endereco);

		// TRÁS TODOS OS VALORES DA PLANILHA

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();

		for (int i = 0; i <= rowCount; i++) {
			int cellCount = sheet.getRow(i).getLastCellNum();

			System.out.println("linha " + i + " - dados: ");

			for (int j = 0; j < cellCount; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " ");
			}

			System.out.println();
			System.out.println();
		}
	}

}
