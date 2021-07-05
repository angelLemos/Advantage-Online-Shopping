package br.com.keeggo.test.steps;



import br.com.keeggo.test.dataProviders.ConfigFileReader;
import br.com.keeggo.test.utils.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private TestContext testContext;
	private ConfigFileReader configLeitorDeArquivos;

	public Hooks(TestContext context) {
		testContext = context;
		configLeitorDeArquivos = new ConfigFileReader();
	}

	@Before
	public void BeforeSteps() {
		testContext.getWebDriverManager().iniciarNavegador();
		testContext.getWebDriverManager().abrirUrl(configLeitorDeArquivos.getUrl());
		
	}

	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().fecharDriver();
	}

}
