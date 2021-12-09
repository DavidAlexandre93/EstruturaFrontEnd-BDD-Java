@CadastroLogin
Feature: Cadastro e Login
  Acessar a pagina home e acessar PageIT para cadastrar e logar
  
  Scenario: Realizar cadastro e login na PageIT
    Given acessou a tela home
    When acessou a tela de cadastro e login PageIT
    And selecionou tela de cadastro
    And preenche o login
    And preenche a senha
    And preenche o email
    And clica cadastrar 
    And preenche o login
    And preenche a senha
    And clica acessar 
    Then valida tela acessada com sucesso

   
    
