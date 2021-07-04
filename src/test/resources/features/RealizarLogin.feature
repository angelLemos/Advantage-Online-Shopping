# language: pt
Funcionalidade: Realizar Login

  Contexto: 
    Dado que usuario esta na pagina inicial do site Advantage
    Quando clicar no botao de login

  @RealizarLogin
  Cenario: Realizar login no site Advantage
  
    E preencher dados para login
    Entao login realizado com sucesso 
  