#language: pt
Funcionalidade: Cadastrar Usuario

  Contexto: 
    Dado que o usuario esta na pagina inicial do site Advantage
    Quando clicar no icone de usuario

  @RealizarCadastro
  Cenario: Realizar cadastro no site Advantage
  
    E preencher ficha cadastral
    Entao usuario cadastrado com sucesso 