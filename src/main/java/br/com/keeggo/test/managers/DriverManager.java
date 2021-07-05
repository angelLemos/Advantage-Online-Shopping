package br.com.keeggo.test.managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import br.com.keeggo.test.enums.DriverType;
import br.com.keeggo.test.utils.TestContext;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private WebDriver webDriver;
	public TestContext testContext;
	private static DriverType driverType;

	public DriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	}

	public WebDriver iniciarNavegador() {
		switch (driverType) {
		case FIREFOX:
			if (webDriver == null) {
				WebDriverManager.firefoxdriver().setup();
				webDriver = new FirefoxDriver();
			}
			break;

		case INTERNETEXPLORER:
			if (webDriver == null) {
				WebDriverManager.iedriver().setup();
				webDriver = new InternetExplorerDriver();
			}
			break;

		case CHROME:
			if (webDriver == null) {
				WebDriverManager.chromedriver().setup();
				webDriver = new ChromeDriver();
			}
			break;
		}

		if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())
			webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(
				FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		return webDriver;
	}
	

	public WebDriver criarDriver() {
		if (webDriver == null)
			webDriver = iniciarNavegador();
		return webDriver;

	}

	public void abrirUrl(String url) {
		webDriver.get(url);
	}

	public void fecharDriver() {
		webDriver.close();
		webDriver.quit();
	}
}
