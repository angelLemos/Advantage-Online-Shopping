package br.com.keeggo.test.utils;

import br.com.keeggo.test.managers.DriverManager;
import br.com.keeggo.test.managers.PageObjectManager;

public class TestContextUtils {

	private DriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContextUtils() {
		webDriverManager = new DriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.createDriver());
	}

	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
