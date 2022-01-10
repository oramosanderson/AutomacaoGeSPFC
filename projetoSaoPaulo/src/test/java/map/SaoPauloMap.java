package map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SaoPauloMap {

	@FindBy (xpath= "//button[@id='menu-toggle']")
	protected WebElement menuHamburger;
	
	@FindBy (xpath= "(//a[contains(text(),'ge')])[2]")
	protected WebElement btnGe;
	
	@FindBy (xpath= "(//a[@class='logo-area'])[1]")
	protected WebElement txtGe;
	
	@FindBy (xpath= "(//div[@class='burger'])[1]")
	protected WebElement menuHamburgerGe;
	
	@FindBy (xpath = "(//span[contains(text(),'menu ge')])[1]")
	protected WebElement menuGeTimes;
	
	@FindBy (xpath = "(//span[contains(text(),'times')])[1]")
	protected WebElement btnMenuTimes;
	
	@FindBy (xpath= "(//div[@id='tab-content-1'])[1]")
	protected WebElement validarMosaicoTimes;
	
	@FindBy (xpath= "(//div[@id='Série A'])[3]/div/div[20]")
	protected WebElement btnEscudoSPFC;
	
	@FindBy (xpath= "(//a[contains(text(),'são paulo')])[1]")
	protected WebElement txtSaoPaulo;
		
	}
	

