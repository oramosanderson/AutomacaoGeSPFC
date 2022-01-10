package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SaoPauloPage;

public class SaoPauloStep {
	SaoPauloPage tela = new SaoPauloPage();

	@Given("que o usuario esteja na tela inicial do globo")
	public void que_o_usuario_esteja_na_tela_inicial_do_globo() {
		tela.acessarSite();
	}

	@Then("a tela sera validada com sucesso")
	public void a_tela_sera_validada_com_sucesso() {
		tela.validarTelaInicioGlobo();
	}

	@When("clicar em mais esporte")
	public void clicar_em_mais_esporte() {
		tela.clicarMaisEsporte();
	}

	@Then("sera exibida pagina inicial do globo esporte")
	public void sera_exibida_pagina_inicial_do_globo_esporte() {
		tela.validarTelaGe();
	}

	@Given("que o usuario esteja na tela inicial do globo esporte")
	public void que_o_usuario_esteja_na_tela_inicial_do_globo_esporte() {
		tela.acessarSite();
		tela.validarTelaInicioGlobo();
		tela.clicarMaisEsporte();
	}

	@When("usuario clicar em menu GE")
	public void usuario_clicar_em_menu_ge() {
		tela.clicarMenuGe();
		
	}

	@Then("sera exibido menu ge com opcoes de times")
	public void sera_exibido_menu_ge_com_opcoes_de_times() {
		tela.validarTodosTimes();
	
	}

	@When("o usuario clicar no time sao paulo")
	public void o_usuario_clicar_no_time_sao_paulo() {
		tela.clicarMenuGe();
		tela.clicarMenuTimes();
		tela.clicarEscudoSPFC();
		
	}

	@Then("sera exibida a pagina do sao paulo")
	public void sera_exibida_a_pagina_do_sao_paulo() {
		tela.validarTxtSaoPaulo();
	}

}
