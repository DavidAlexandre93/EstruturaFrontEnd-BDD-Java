package Cucumber.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constante.ScreenShotCapture;
import Constante.Utils;

public class CadastroLoginSteps {

	private static WebDriver driver;

	public static void SetUp() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.davidalexandrefernandes.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ScreenShotCapture.screenShot();
	}

	public static void TelaCadastroLogin() {
		driver.findElement(By.id("clickevent")).click();
		ScreenShotCapture.screenShot();
	}

	public static void SelecionarCadastro() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/label[1]")).click();
	}

	public static void PreencherLogin() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("login")).sendKeys("David");
	}

	public static void PreencherSenha() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("senha")).sendKeys("admin");
	}

	public static void PreencherEmail() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.id("email")).sendKeys("davidalexandrefernandes@outlook.com");
	}

	public static void ClicarCadastrar() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/input")).click();
		Utils.AlertOK();
	}

	public static void ClicarAcessar() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/form/input")).click();
		Utils.AlertOK();
	}

	public static void ValidateTelaLogada() {
		ScreenShotCapture.screenShot();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/a/img")).isDisplayed();

	}

	public static void Evidencias() throws Exception {
		ScreenShotCapture.screenShot();
		ScreenShotCapture.arquivosDir();
	}

}
