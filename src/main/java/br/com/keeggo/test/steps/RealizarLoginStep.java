package br.com.keeggo.test.steps;

import br.com.keeggo.test.utils.TestContext;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RealizarLoginStep {

	TestContext testContext;
	
	public RealizarLoginStep(TestContext context) {
		testContext = context;
	}

	@Quando("preencher dados para login")
	public void preencherDadosParaLogin() {
	}

	@Entao("login realizado com sucesso")
	public void loginRealizadoComSucesso() {
	}

}
