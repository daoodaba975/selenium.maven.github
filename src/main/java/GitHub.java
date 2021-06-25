import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GitHub {
	
	private WebDriver driver;
	private By xpathButtonSeCoonnecter = By.name("commit");
	private By xpathInputMdp = By.id("password");
	private By xpathInputLogin = By.name("login");
	
	public GitHub(WebDriver driver) {
		this.driver = driver;
	}
	
	public void TestConnexion () {
		 driver.findElement(xpathInputLogin).sendKeys("davinhoba9@outlook.fr");
		 driver.findElement(xpathInputMdp).sendKeys("0000");
		 driver.findElement(xpathButtonSeCoonnecter).click();
	}

}