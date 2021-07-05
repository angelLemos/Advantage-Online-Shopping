package br.com.keeggo.test.steps;

import br.com.keeggo.test.pages.TelaInicialPage;
import br.com.keeggo.test.utils.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;


public class PaginaInicialSteps {

	TestContext testContext;
	TelaInicialPage telaInicialPage;
	
	public PaginaInicialSteps(TestContext context) {
		testContext = context;
		telaInicialPage = testContext.getPageObjectManager().getTelaInicialPage();
	}

	@Dado("que o usuario esta na pagina inicial do site Advantage")
	public void paginaInicialDoSiteAdvantage() {
		
	}

	@Quando("clicar no icone de usuario")
	public void clicarNoIconeDeUsuario() {
		telaInicialPage.aguardarElemento();
		telaInicialPage.clicarLnk();
	}

}
