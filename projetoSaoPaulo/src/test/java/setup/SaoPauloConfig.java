package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SaoPauloConfig {

	String identificadorDriver = "webdriver.chrome.driver";
	String caminhoDriver = "C:\\Drivers\\chromedriver.exe";
	String siteHome = "https://google.com/";
	private static WebDriver driver;

	@Before
	public void beforeCenario(Scenario cenario) {

		System.setProperty(identificadorDriver, caminhoDriver);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to(siteHome);
	}

	@After
	public void afterCenario(Scenario cenario) {
		driver.close();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
