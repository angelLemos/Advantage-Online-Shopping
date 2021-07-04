package br.com.keeggo.test.utils;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private WebDriverManager webDriverManager;
	private WebDriver webDriver;

	@SuppressWarnings("static-access")
	public void iniciarNavegador(String browserName) {
		switch (browserName) {
		case "Firefox":
			if (webDriver == null) {
				webDriverManager.firefoxdriver().setup();
				webDriver = new FirefoxDriver();
			}
			break;

		case "IE":
			if (webDriver == null) {
				webDriverManager.iedriver().setup();
				webDriver = new InternetExplorerDriver();
			}
			break;

		case "Chrome":
			if (webDriver == null) {
				webDriverManager.chromedriver().setup();
				webDriver = new ChromeDriver();
			}
			break;
		}
	}

//	public  void LoadApplication(string url) {
//		Driver.Url = url;
//	}

	public void fecharDriver() {
		webDriver.close();
		webDriver.quit();
	}
}
