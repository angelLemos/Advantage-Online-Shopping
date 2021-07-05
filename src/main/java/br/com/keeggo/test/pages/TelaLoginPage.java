package br.com.keeggo.test.pages;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TelaLoginPage {

	WebDriver driver;
	private JavascriptExecutor js;

	public TelaLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	private WebElement lnkCriarNovaConta;
	
	@FindBy(how = How.NAME, using = "username")
	private WebElement txtUsername;
	
	@FindBy(how = How.NAME, using = "password")
	private WebElement txtPassword;
	
	@FindBy(how = How.ID, using = "sign_in_btnundefined")
	private WebElement btnEntrar;
	
	
	
	public void clicarEmCriarNovaConta() {
	js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", lnkCriarNovaConta);
}
	public void inserirUsername(String username) {
		txtUsername.sendKeys(username);
	}
	
	public void inserirPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clicarEmEntrar() {
		btnEntrar.click();
	}
}
