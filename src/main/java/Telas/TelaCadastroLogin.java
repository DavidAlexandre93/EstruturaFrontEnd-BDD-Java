package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaCadastroLogin {

	private WebDriver driver;

	public TelaCadastroLogin(WebDriver driver) {
		this.driver = driver;
	}

	/********************************************************************
	 * @category Digitar Cadastro Login
	 ********************************************************************/
	public TelaCadastroLogin Login(String login) {
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("login")).sendKeys(login);
		return new TelaCadastroLogin(driver);
	}

	/********************************************************************
	 * @category Digitar Cadastro Senha
	 ********************************************************************/
	public TelaCadastroLogin Senha(String senha) {
		driver.findElement(By.id("senha")).click();
		driver.findElement(By.id("senha")).sendKeys(senha);
		return new TelaCadastroLogin(driver);
	}

	/********************************************************************
	 * @category Digitar Cadastro Email
	 ********************************************************************/
	public TelaCadastroLogin CadastroEmail(String email) {
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		return new TelaCadastroLogin(driver);
	}

	/********************************************************************
	 * @category Clicar no botao para cadastrar
	 ********************************************************************/
	public TelaCadastroLogin BotaoCadastrar() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/input")).click();
		return new TelaCadastroLogin(driver);
	}

	/********************************************************************
	 * @category Clicar no botao para acessar
	 ********************************************************************/
	public TelaCadastroLogin BotaoAcessar() {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/input")).click();
		return new TelaCadastroLogin(driver);
	}

	/********************************************************************
	 * @category Validate Tela Logada
	 ********************************************************************/
	public TelaCadastroLogin ValidateTelaLogada() {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/a/img")).isDisplayed();
		return new TelaCadastroLogin(driver);
	}

}
