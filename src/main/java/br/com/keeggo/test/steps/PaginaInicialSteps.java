package br.com.keeggo.test.steps;

import org.openqa.selenium.WebDriver;

import br.com.keeggo.test.pages.TelaInicialPage;
import br.com.keeggo.test.utils.Screenshot;
import br.com.keeggo.test.utils.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;


public class PaginaInicialSteps {

	WebDriver driver;
	private TestContext testContext;
	private TelaInicialPage telaInicialPage;
	private String stepName;
	private Screenshot screenshot;
	
	public PaginaInicialSteps(TestContext context) {
		testContext = context;
		telaInicialPage = testContext.getPageObjectManager().getTelaInicialPage();
		screenshot = new Screenshot(context);
	}

	@Dado("que o usuario esta na pagina inicial do site Advantage")
	public void paginaInicialDoSiteAdvantage() {
		stepName = new Throwable().getStackTrace()[0].getMethodName();
		telaInicialPage.aguardarElemento();
		screenshot.getScreenshot(stepName);
	}

	@Quando("clicar no icone de usuario")
	public void clicarNoIconeDeUsuario() {
		stepName = new Throwable().getStackTrace()[0].getMethodName();
		telaInicialPage.aguardarElemento();
		screenshot.getScreenshot(stepName);
		telaInicialPage.clicarLnk();
	}

}
