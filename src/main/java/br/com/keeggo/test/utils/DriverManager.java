package br.com.keeggo.test.utils;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private WebDriver webDriver;

	
	public void iniciarNavegador(String browserName) {
		switch (browserName) {
		case "Firefox":
			if (webDriver == null) {
				WebDriverManager.firefoxdriver().setup();
				webDriver = new FirefoxDriver();
			}
			break;

		case "IE":
			if (webDriver == null) {
				WebDriverManager.iedriver().setup();
				webDriver = new InternetExplorerDriver();
			}
			break;

		case "Chrome":
			if (webDriver == null) {
				WebDriverManager.chromedriver().setup();
				webDriver = new ChromeDriver();
			}
			break;
		}
	}
	
	public void abrirUrl(String url) {
		webDriver.get(url);
	}


	public void fecharDriver() {
		webDriver.quit();
	}
}
