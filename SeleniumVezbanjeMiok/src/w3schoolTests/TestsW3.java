package w3schoolTests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestsW3 extends BaseTestsW3{
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.w3schools.com/");
	}
	
	@Test (priority = 0)
	public void logIn() throws InterruptedException {
		
		homePage.navigateToLogInBtn();
		Thread.sleep(1000);
		username = citacIzExcela.getStringData("LogIn", 1, 2);
		password = citacIzExcela.getStringData("LogIn", 2, 2);
		Thread.sleep(1000);
		logInPage.logIn(username, password);
		Thread.sleep(1000);
		homePage.navigateToProfileLogoBtn();
		Thread.sleep(2000);
		citacIzExcela.asertovanje("LogIn", 3, 2, profilePage.getLogOutBtn().getText());
		Thread.sleep(2000);
		}
	
	@Test (priority = 5)
	public void choseJavaCourse() throws InterruptedException {
		logIn();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		homePage.navigateToTutorialsTab();
		Thread.sleep(1000);
		homePage.navigateToLearnJavaLabel();
		Thread.sleep(1000);
		javaTutorialPage.navigateToStartLearningJavaBtn();
		Thread.sleep(2000);
		citacIzExcela.asertovanje("LogIn", 4, 2, javaTutorialPage.getAssertJavaTutorialLabel().getText());
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
