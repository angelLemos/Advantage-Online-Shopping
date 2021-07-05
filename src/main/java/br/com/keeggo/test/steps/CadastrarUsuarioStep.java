package br.com.keeggo.test.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.keeggo.test.pages.TelaFichaCadastralPage;
import br.com.keeggo.test.pages.TelaInicialPage;
import br.com.keeggo.test.pages.TelaLoginPage;
import br.com.keeggo.test.utils.TestContext;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;



public class CadastrarUsuarioStep {
	
	WebDriver driver;
	TestContext testContext;
	private TelaLoginPage loginPage;
	private TelaFichaCadastralPage fichaCadastralPage;
	private TelaInicialPage telaInicialPage;
	
	String nomeUsuario = "Eloah";
	
	public CadastrarUsuarioStep(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getTelaLoginPage();
		fichaCadastralPage = testContext.getPageObjectManager().telaFichaCadastralPage();
		telaInicialPage = testContext.getPageObjectManager().getTelaInicialPage();
	}

	@Quando("preencher ficha cadastral")
	public void preencherFichaCadastral() {
		loginPage.clicarEmCriarNovaConta();
		fichaCadastralPage.inserirNomeUsuario(nomeUsuario);
		fichaCadastralPage.inserirEmail("ari@hotmail.com");
		fichaCadastralPage.inserirSenha("Maria05");
		fichaCadastralPage.confirmarSenha("Maria05");
		fichaCadastralPage.inserirNome("Ari");
		fichaCadastralPage.inserirSobrenome("Silva");
		fichaCadastralPage.inserirTelefone("34322455");
		fichaCadastralPage.selecionarPais("Brazil");
		fichaCadastralPage.inserirCidade("São Paulo");
		fichaCadastralPage.inserirEndereco("Av. Alberto, 2001");
		fichaCadastralPage.inserirEstado("São Paulo");
		fichaCadastralPage.inserirCEP("30022345");
		fichaCadastralPage.ClicarEmAceitarTermos();
		fichaCadastralPage.ClicarEmRegistrar();
		
		
	}

	@Entao("usuario realizou login com sucesso")
	public void usuarioRealizouLoginComSucesso() {
		telaInicialPage.aguardarElemento();
		Assert.assertEquals(nomeUsuario, telaInicialPage.nomeUsuario());
		
	}

}
