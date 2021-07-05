#language: pt
Funcionalidade: Cadastrar Usuario

  Contexto: 
    Dado que o usuario esta na pagina inicial do site Advantage
    Quando clicar no icone de usuario

  @RealizarCadastro
  Cenario: Realizar cadastrar no site Advantage
  
    E preencher ficha cadastral
    Entao usuario realizou login com sucesso 