package Cucumber.Passos;

import Constante.Utils;
import Cucumber.Steps.CadastroLoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastroLoginPassos {

	CadastroLoginSteps run = new CadastroLoginSteps();
	CadastroLoginSteps cadastro = new CadastroLoginSteps();

	@Given("^acessou a tela home$")
	public void acessaTelaHome() throws Throwable {
		CadastroLoginSteps.SetUp();
		Utils.WaitElement();
	}

	@When("^acessou a tela de cadastro e login PageIT$")
	public void acessaTelaCadastroLogin() throws Throwable {
		CadastroLoginSteps.TelaCadastroLogin();
	}

	@When("^selecionou tela de cadastro$")
	public void selecionaCadastrar() throws Throwable {
		CadastroLoginSteps.SelecionarCadastro();
	}

	@When("^preenche o login$")
	public void preencheLogin() throws Throwable {
		CadastroLoginSteps.PreencherLogin();
	}

	@When("^preenche a senha$")
	public void preencheSenha() throws Throwable {
		CadastroLoginSteps.PreencherSenha();
	}

	@When("^preenche o email$")
	public void preencheEmail() throws Throwable {
		CadastroLoginSteps.PreencherEmail();
	}

	@When("^clica cadastrar$")
	public void clicaCadastrar() throws Throwable {
		CadastroLoginSteps.ClicarCadastrar();
	}

	@When("^preenche o login$")
	public void preencheLoginAcesso() throws Throwable {
		CadastroLoginSteps.PreencherLogin();
	}

	@When("^preenche a senha$")
	public void preencheSenhaAcesso() throws Throwable {
		CadastroLoginSteps.PreencherSenha();
	}

	@When("^clica acessar$")
	public void clicaAcessar() throws Throwable {
		CadastroLoginSteps.ClicarAcessar();
	}

	@Then("^valida tela acessada com sucesso$")
	public void validaTelaLogadaSucesso() throws Throwable {
		CadastroLoginSteps.ValidateTelaLogada();
		CadastroLoginSteps.Evidencias();
	}

}
