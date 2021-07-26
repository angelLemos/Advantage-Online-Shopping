package br.com.keeggo.test.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.keeggo.test.pages.TelaInicialPage;
import br.com.keeggo.test.pages.TelaLoginPage;
import br.com.keeggo.test.utils.ScreenshotUtils;
import br.com.keeggo.test.utils.TestContextUtils;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class RealizarLoginStep {
	
	WebDriver driver;
	private TestContextUtils testContext;
	private TelaLoginPage telaLoginPage;
	private TelaInicialPage telaInicialPage;
	private ScreenshotUtils screenshot;
	private String nomeUsuario = "LuizaM";
	

	public RealizarLoginStep(TestContextUtils context) {
		testContext = context;
		telaLoginPage = testContext.getPageObjectManager().getTelaLoginPage();
		telaInicialPage = testContext.getPageObjectManager().getTelaInicialPage();
		screenshot = new ScreenshotUtils(context);

	}

	@Quando("preencher dados para login")
	public void preencherDadosParaLogin() {
		telaLoginPage.inserirUsername(nomeUsuario);
		telaLoginPage.inserirPassword("Maria05");
		screenshot.getScreenshot("Dados de login preenchidos");
		telaLoginPage.clicarEmEntrar();

	}
	
	@Entao("usuario realizou login com sucesso")
	public void usuarioRealizouLoginComSucesso() {
		telaInicialPage.aguardarElemento();
		Assert.assertEquals(nomeUsuario, telaInicialPage.nomeUsuario());
		screenshot.getScreenshot("Usuário cadastrado com sucesso");
		
	}


}
