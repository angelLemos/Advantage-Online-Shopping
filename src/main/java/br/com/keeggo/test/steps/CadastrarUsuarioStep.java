package br.com.keeggo.test.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.keeggo.test.pages.TelaFichaCadastralPage;
import br.com.keeggo.test.pages.TelaInicialPage;
import br.com.keeggo.test.pages.TelaLoginPage;
import br.com.keeggo.test.utils.Screenshot;
import br.com.keeggo.test.utils.TestContext;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;



public class CadastrarUsuarioStep {
	
	WebDriver driver;
	private TestContext testContext;
	private TelaLoginPage loginPage;
	private TelaFichaCadastralPage fichaCadastralPage;
	private TelaInicialPage telaInicialPage;
	private Screenshot screenshot;
	
	private String nomeUsuario = "Angelicaa";
	
	public CadastrarUsuarioStep(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getTelaLoginPage();
		fichaCadastralPage = testContext.getPageObjectManager().telaFichaCadastralPage();
		telaInicialPage = testContext.getPageObjectManager().getTelaInicialPage();
		screenshot = new Screenshot(context);
	}

	@Quando("preencher ficha cadastral")
	public void preencherFichaCadastral() {
		loginPage.clicarEmCriarNovaConta();
		fichaCadastralPage.inserirNomeUsuario(nomeUsuario);
		fichaCadastralPage.inserirEmail("mariah@hotmail.com");
		fichaCadastralPage.inserirSenha("Maria05");
		fichaCadastralPage.confirmarSenha("Maria05");
		screenshot.getScreenshot("Dados da conta");
		fichaCadastralPage.inserirNome("Ari");
		fichaCadastralPage.inserirSobrenome("Silva");
		fichaCadastralPage.inserirTelefone("34322455");
		screenshot.getScreenshot("Dados pessoais");
		fichaCadastralPage.selecionarPais("Brazil");
		fichaCadastralPage.inserirCidade("São Paulo");
		fichaCadastralPage.inserirEndereco("Av. Alberto, 2001");
		fichaCadastralPage.inserirEstado("São Paulo");
		fichaCadastralPage.inserirCEP("30022345");
		screenshot.getScreenshot("Dados do endereço");
		fichaCadastralPage.ClicarEmAceitarTermos();
		screenshot.getScreenshot("Ficha cadastral preenchida");
		fichaCadastralPage.ClicarEmRegistrar();
		
		
	}

	@Entao("usuario cadastrado com sucesso")
	public void usuarioCadastradoComSucesso() {
		telaInicialPage.aguardarElemento();
		Assert.assertEquals(nomeUsuario, telaInicialPage.nomeUsuario());
		screenshot.getScreenshot("Usuário cadastrado com sucesso");
		
	}

}
