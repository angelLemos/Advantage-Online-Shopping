package br.com.keeggo.test.utils;

import br.com.keeggo.test.managers.DriverManager;
import br.com.keeggo.test.managers.PageObjectManager;

public class TestContext {

	private DriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		webDriverManager = new DriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.criarDriver());
	}

	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
