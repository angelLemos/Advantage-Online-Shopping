package br.com.keeggo.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TelaFichaCadastralPage {

	WebDriver driver;

	public TelaFichaCadastralPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtUsuario;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txtEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txtSenha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txtConfirmaSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txtNome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txtSobrenome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement txtTelefone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement cbxPais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement txtCidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement txtEndereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement txtEstado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement txtCEP;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement chkAceitarTermos;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btnRegistrar;


	public void inserirNomeUsuario(String nomeUsuario)  {
		txtUsuario.sendKeys(nomeUsuario);
	}

	public void inserirEmail(String email)  {
		txtEmail.sendKeys(email);
	}

	public void inserirSenha(String senha)  {
		txtSenha.sendKeys(senha);
	}

	public void confirmarSenha(String senha)  {
		txtConfirmaSenha.sendKeys(senha);

	}

	public void inserirNome(String nome) {
		txtNome.sendKeys(nome);
	}

	public void inserirSobrenome(String sobrenome) {
		txtSobrenome.sendKeys(sobrenome);
	}

	public void inserirTelefone(String telefone)  {
		txtTelefone.sendKeys(telefone);

	}

	public void selecionarPais(String pais)  {
	    Select select = new Select(cbxPais);
        select.selectByVisibleText(pais);
	
	}

	public void inserirCidade(String cidade)  {
		txtCidade.sendKeys(cidade);
	}

	public void inserirEndereco(String endereco) {
		txtEndereco.sendKeys(endereco);
	}

	public void inserirEstado(String estado) {
		txtEstado.sendKeys(estado);
	}

	public void inserirCEP(String cep) {
		txtCEP.sendKeys(cep);
	}

	public void ClicarEmAceitarTermos() {
		chkAceitarTermos.click();
	}

	public void ClicarEmRegistrar() {
		btnRegistrar.click();
	}

}
