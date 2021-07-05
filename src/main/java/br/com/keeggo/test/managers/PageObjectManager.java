package br.com.keeggo.test.managers;

import org.openqa.selenium.WebDriver;

import br.com.keeggo.test.pages.TelaFichaCadastralPage;
import br.com.keeggo.test.pages.TelaInicialPage;
import br.com.keeggo.test.pages.TelaLoginPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private TelaInicialPage telaInicialPage;
	private TelaLoginPage telaLoginPage;
	private TelaFichaCadastralPage telaFichaCadastralPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public TelaInicialPage getTelaInicialPage() {
		return (telaInicialPage == null) ? telaInicialPage = new TelaInicialPage(driver) : telaInicialPage;
		
		
	}
	public TelaLoginPage getTelaLoginPage() {
		return (telaLoginPage == null) ? telaLoginPage = new TelaLoginPage(driver) : telaLoginPage;
		
		
	}
	public TelaFichaCadastralPage telaFichaCadastralPage() {
		return (telaFichaCadastralPage == null) ? telaFichaCadastralPage = new TelaFichaCadastralPage(driver) : telaFichaCadastralPage;
		
		
	}
	

}
