package w3schoolTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import w3schoolPages.HomePageW3;
import w3schoolPages.JavaTutorialPageW3;
import w3schoolPages.LogInPageW3;
import w3schoolPages.ProfilePageW3;

public class BaseTestsW3 {
	WebDriver driver;
	HomePageW3 homePage;
	ExcelCitac citacIzExcela;
	LogInPageW3 logInPage;
	ProfilePageW3 profilePage;
	JavaTutorialPageW3 javaTutorialPage;
	String username;
	String password;
	
	@BeforeClass
	public void preKlase() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		this.homePage = new HomePageW3(driver);
		this.logInPage = new LogInPageW3(driver);
		this.profilePage = new ProfilePageW3(driver);
		this.javaTutorialPage = new JavaTutorialPageW3(driver);
		this.citacIzExcela = new ExcelCitac("data/W3Excel.xlsx");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void posleKlase() {
		driver.close();
		System.out.println("The end");
	}
}
	