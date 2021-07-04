package br.com.keeggo.test.steps;



import br.com.keeggo.test.dataProviders.ConfigLeitorDeArquivos;
import br.com.keeggo.test.utils.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private TestContext testContext;
	private ConfigLeitorDeArquivos configLeitorDeArquivos;

	public Hooks(TestContext context) {
		testContext = context;
		configLeitorDeArquivos = new ConfigLeitorDeArquivos();
	}

	@Before
	public void BeforeSteps() {
		testContext.getWebDriverManager().iniciarNavegador("Chrome");
		testContext.getWebDriverManager().abrirUrl(configLeitorDeArquivos.getUrl());
		
	}

	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().fecharDriver();
	}

}
