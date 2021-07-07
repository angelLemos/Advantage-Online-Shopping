package br.com.keeggo.test.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TelaInicialPage {

	WebDriver driver;
	private JavascriptExecutor js;

	public TelaInicialPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement lnkUser;

	@FindBy(how = How.ID, using = "menuUserLink")
	private WebElement menuUser;

	public void clicarLnk() {
		aguardarElemento();
		lnkUser.click();
	}

	public void aguardarElemento() {
		js = (JavascriptExecutor) driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1],5000);");
	}

	public String nomeUsuario() {
		return menuUser.getText();

	}

}
