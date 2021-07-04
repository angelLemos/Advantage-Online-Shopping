package br.com.keeggo.test.utils;

public class TestContext {

	private DriverManager webDriverManager;

	public TestContext() {
		webDriverManager = new DriverManager();
	}

	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}

}
