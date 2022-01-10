package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import map.SaoPauloMap;
import setup.SaoPauloConfig;

public class SaoPauloPage extends SaoPauloMap {
	static WebDriver driver;

	public SaoPauloPage() {
		PageFactory.initElements(SaoPauloConfig.getDriver(), this);
	}
	public void acessarSite() {
		SaoPauloConfig.getDriver().navigate().to("https://www.globo.com/");
	}

	public void validarTelaInicioGlobo() {
		menuHamburger.isDisplayed();
	}
	public void clicarMaisEsporte() {
		btnGe.click();
	}
	public void validarTelaGe() {
		txtGe.isDisplayed();
	}
	public void clicarMenuGe() {
		menuHamburgerGe.click();
	}
	public void validarMenuTimes() {
		menuGeTimes.isDisplayed();
		
	}
	public void clicarMenuTimes() {
		btnMenuTimes.click();
	}
	
	public void validarTodosTimes() {
		validarMosaicoTimes.isDisplayed();
	}
	
	public void clicarEscudoSPFC() {
		btnEscudoSPFC.click();
	}
	public void validarTxtSaoPaulo() {
		txtSaoPaulo.isDisplayed();
	}
	
}
