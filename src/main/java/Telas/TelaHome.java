package Telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelaHome {

	private WebDriver driver;

	public TelaHome(WebDriver driver) {
		this.driver = driver;
	}

	/********************************************************************
	 * @category Clicar no botão PageIT
	 ********************************************************************/
	public TelaHome ClicarBotao() {
		driver.findElement(By.id("clickevent")).click();
		return this;
	}

	/********************************************************************
	 * @category Selecionar a tela de cadastro
	 ********************************************************************/
	public TelaHome MudarTelaToCadastro() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/label[1]")).click();
		return this;
	}

}
