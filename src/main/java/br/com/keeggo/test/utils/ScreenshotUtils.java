package br.com.keeggo.test.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

public class ScreenshotUtils {

	private TestContextUtils testContext;

	public ScreenshotUtils(TestContextUtils context) {
		testContext = context;
	}

	public String getScreenshot(String screenshotName) {
 
		File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().createDriver())
				.getScreenshotAs(OutputType.FILE);
		
		 String user = System.getProperty("user.dir");
		 Path path = Paths.get(user + "\\AdvantageShopping\\target\\cucumber-reports\\screenshots");

		    try {
				Files.createDirectories(path);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		String caminhoDoArquivo = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/"
				+ screenshotName + ".png";

		File destino = new File(caminhoDoArquivo);

		try {
			FileUtils.copyFile(sourcePath, destino);
			Reporter.addScreenCaptureFromPath(caminhoDoArquivo.toString());
		} catch (IOException e) {
			System.out.println(" O print falhou " + e.getMessage());
		}

		return caminhoDoArquivo;
	}
}
