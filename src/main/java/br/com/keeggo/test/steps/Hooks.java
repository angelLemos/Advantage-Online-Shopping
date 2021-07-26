package br.com.keeggo.test.steps;

import br.com.keeggo.test.dataProviders.ConfigFileReader;
import br.com.keeggo.test.utils.ScreenshotUtils;
import br.com.keeggo.test.utils.TestContextUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private TestContextUtils testContext;
	private ConfigFileReader configLeitorDeArquivos;
	private ScreenshotUtils screenshot;

	public Hooks(TestContextUtils context) {
		testContext = context;
		configLeitorDeArquivos = new ConfigFileReader();
		screenshot = new ScreenshotUtils(context);
	}

	@Before
	public void BeforeSteps() {
		testContext.getWebDriverManager().startBrowser();
		testContext.getWebDriverManager().getUrl(configLeitorDeArquivos.getUrl());

	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
				screenshot.getScreenshot(screenshotName + " - Falhou");
		}
	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getWebDriverManager().quitDriver();
	}

}
