#language: pt
Funcionalidade: Realizar Login

  Contexto: 
    Dado que o usuario esta na pagina inicial do site Advantage
    Quando clicar no icone de usuario

  @RealizarLogin
  Cenario: Realizar login no site Advantage
  
    E preencher dados para login
    Entao usuario realizou login com sucesso 
  