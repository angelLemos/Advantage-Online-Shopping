package br.com.keeggo.test.steps;

import org.openqa.selenium.WebDriver;

import br.com.keeggo.test.pages.TelaInicialPage;
import br.com.keeggo.test.utils.ScreenshotUtils;
import br.com.keeggo.test.utils.TestContextUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;


public class PaginaInicialSteps {

	WebDriver driver;
	private TestContextUtils testContext;
	private TelaInicialPage telaInicialPage;
	private String stepName;
	private ScreenshotUtils screenshot;
	
	public PaginaInicialSteps(TestContextUtils context) {
		testContext = context;
		telaInicialPage = testContext.getPageObjectManager().getTelaInicialPage();
		screenshot = new ScreenshotUtils(context);
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
