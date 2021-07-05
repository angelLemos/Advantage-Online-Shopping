package br.com.keeggo.test.steps;

import br.com.keeggo.test.pages.TelaLoginPage;
import br.com.keeggo.test.utils.TestContext;
import cucumber.api.java.pt.Quando;

public class RealizarLoginStep {

	TestContext testContext;
	TelaLoginPage telaLoginPage;

	public RealizarLoginStep(TestContext context) {
		testContext = context;
		telaLoginPage = testContext.getPageObjectManager().getTelaLoginPage();

	}

	@Quando("preencher dados para login")
	public void preencherDadosParaLogin() {
		telaLoginPage.inserirUsername("Eloah");
		telaLoginPage.inserirPassword("Maria05");
		telaLoginPage.clicarEmEntrar();

	}

}
