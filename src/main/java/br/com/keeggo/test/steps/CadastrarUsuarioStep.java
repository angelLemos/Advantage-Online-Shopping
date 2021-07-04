package br.com.keeggo.test.steps;

import br.com.keeggo.test.utils.TestContext;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;



public class CadastrarUsuarioStep {

	TestContext testContext;
	
	public CadastrarUsuarioStep(TestContext context) {
		testContext = context;
	}

	@Quando("preencher ficha cadastral")
	public void preencherFichaCadastral() {
	}

	@Entao("cadastro realizado com sucesso")
	public void cadastroRealizadoComSucesso() {
	}

}
