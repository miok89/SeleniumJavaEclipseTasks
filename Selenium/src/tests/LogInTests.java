package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.MainPage;
import pages.MyAccountPage;

public class LogInTests extends BaseTest{
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(2000);
		mainPage.navigateToMyAccount();
		Thread.sleep(2000);
	}
	
	@Test (priority = 0)
	public void logIn() throws InterruptedException {
		
		username = citacIzExela.getStringData("LogIn", 1, 2);
		//password = String.valueOf(citacIzExela.getIntData("LogIn", 2, 2));
		password = citacIzExela.getData("LogIn", 2, 2);
		String expected1 = citacIzExela.getStringData("LogIn", 3, 2);
		// customer; 123456789
		myAccountPage.logIn(username, password);
		Thread.sleep(2000);
		String actual1 = myAccountPage.getLogOutLabel().getText();
		Assert.assertEquals(actual1, expected1);
		}
	
	@Test (priority = 5)
	public void logInWithoutCredentials() throws InterruptedException, NullPointerException {
		
		String expected1 = citacIzExela.getStringData("logInEmptyFields", 3, 2);
		myAccountPage.logInButtonClick();
		Thread.sleep(2000);
		
		String actual1 = myAccountPage.getNoCredentialsLabel().getText();
		Assert.assertEquals(actual1, expected1);
		}
	
	@Test (priority = 10)
	public void logInWrongCredentials() throws InterruptedException {
		
		username = citacIzExela.getStringData("invalidLogIn", 1, 2);
		password = String.valueOf(citacIzExela.getStringData("invalidLogIn", 2, 2));
		String expected1 = citacIzExela.getStringData("invalidLogIn", 3, 2);
		
		myAccountPage.logIn(username, password);
		Thread.sleep(2000);
		
		String actual1 = myAccountPage.getWrongCredentialsLabel().getText();
		Assert.assertEquals(actual1, expected1);
		}
	
	@Test (priority = 15)
	public void logOut() throws InterruptedException {
		logIn();
		myAccountPage.getLogOutLabel().click();
		String expected1 = citacIzExela.getStringData("logOut", 1, 2);
		
		String actual1 = myAccountPage.getLogInButton().getText();
		Assert.assertEquals(actual1, expected1);
		}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
}
