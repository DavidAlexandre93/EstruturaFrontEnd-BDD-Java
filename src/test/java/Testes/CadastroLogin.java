package Testes;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Constante.ChamadaMassa;
import Constante.ScreenShotCapture;
import Constante.Utils;
import Funcoes.ConfigFunction;
import Telas.TelaHome;
import Telas.TelaCadastroLogin;

/********************************************************************
 * @category Teste para realizar cadastro de Customer
 ********************************************************************/

public class CadastroLogin {

	private WebDriver driver;

	ChamadaMassa massaDados = new ChamadaMassa();
	// ScreenShotCapture telaScreen = new ScreenShotCapture();

	@Before
	public void IniciarBrowser() {

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void RealizarCustomer() {

		try {

			JSONObject obj = massaDados.dadosJson();

			ConfigFunction config = new ConfigFunction(driver);
			TelaHome home = new TelaHome(driver);
			TelaCadastroLogin login = new TelaCadastroLogin(driver);

			config.acessar();
			ScreenShotCapture.screenShot();
			Utils.WaitElement();
			home.ClicarBotao();
			Utils.WaitElement();
			home.MudarTelaToCadastro();
			Utils.WaitElement();
			ScreenShotCapture.screenShot();
			login.Login((String) obj.get("login"));
			Utils.WaitElement();
			login.Senha((String) obj.get("senha"));
			Utils.WaitElement();
			login.CadastroEmail((String) obj.get("email"));
			Utils.WaitElement();
			login.BotaoCadastrar();
			Utils.WaitElement();
			ScreenShotCapture.screenShot();
			Utils.AlertOK();
			Utils.WaitElement();
			login.Login((String) obj.get("login"));
			Utils.WaitElement();
			login.Senha((String) obj.get("senha"));
			Utils.WaitElement();
			login.BotaoAcessar();
			Utils.WaitElement();
			ScreenShotCapture.screenShot();
			Utils.AlertOK();
			Utils.WaitElement();
			login.ValidateTelaLogada();
			Utils.WaitElement();
			ScreenShotCapture.screenShot();
			ScreenShotCapture.arquivosDir();

		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}

	}

	@After
	public void FinalizarExecucao() {
		driver.quit();
	}

}
