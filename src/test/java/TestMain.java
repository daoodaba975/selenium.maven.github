import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestMain {
	
	WebDriver driver;
	GitHub github;
	
	@BeforeTest
	public void conf() {
		System.setProperty("webdriver.chrome.driver","C:\\workspace\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
	}
	
	@Test
	public void TestConnexion () {
		github = new GitHub(driver);
		github.TestConnexion();
	}
	
	@AfterTest
	public void End () {
		driver.close();
	}

}
