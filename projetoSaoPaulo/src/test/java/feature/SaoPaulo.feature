#language: en
 
Feature: validar inicio globo.com

@CT001 @All
Scenario: validar tela de Globo.com
Given que o usuario esteja na tela inicial do globo
Then a tela sera validada com sucesso

@CT002 @All
Scenario: validar clique em mais esporte
Given que o usuario esteja na tela inicial do globo
When clicar em mais esporte
Then sera exibida pagina inicial do globo esporte

@CT003 @All
Scenario: validar menu times ge
Given que o usuario esteja na tela inicial do globo esporte
When usuario clicar em menu GE
Then sera exibido menu ge com opcoes de times

@CT004 @All
Scenario: validar pagina do sao paulo fc
Given que o usuario esteja na tela inicial do globo esporte
When o usuario clicar no time sao paulo
Then sera exibida a pagina do sao paulo 



