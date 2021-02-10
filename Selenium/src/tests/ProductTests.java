package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.MainPage;
import pages.MyAccountPage;
import pages.ShopPage;

public class ProductTests extends BaseTest{
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().to("http://cms.demo.katalon.com/");
		mainPage.navigateToShopTab();
	}
	
	@Test (priority = 0)
	public void addProductToCart() throws InterruptedException {
		
		shopPage.getFlyngNinjaAddToCardButton().click();
		Thread.sleep(2000);
		mainPage.navigateToCartTab();
		Thread.sleep(2000);
		String actual1 = cartPage.assertNameFlyngNinja().getText();
		String expected1 = citacIzExela.getStringData("1 ninja", 1, 1);
		Assert.assertEquals(actual1, expected1);
		}
	
	@Test (priority = 5)
	public void deleteProductFromCart() throws InterruptedException {
		
		addProductToCart();
		Thread.sleep(2000);
		cartPage.deleteFlyngNinja().click();
		Thread.sleep(2000);
		
		boolean actual1 = cartPage.getRestoreItemLabel().isDisplayed();
		boolean expected1 = true;
		Assert.assertEquals(actual1, expected1);
		Thread.sleep(2000);
		}
	
	@Test (priority = 10)
	public void add3productsToCart() throws InterruptedException {
		
		shopPage.getHappyNinja1AddToCardButton().click();
		Thread.sleep(1000);
		shopPage.getHappyNinja2AddToCardButton().click();
		Thread.sleep(1000);
		shopPage.getNinjaSilhouetteAddToCardButton().click();
		Thread.sleep(1000);
		mainPage.navigateToCartTab();
		Thread.sleep(2000);
		
		String actual1 = cartPage.assertNameHappyNinja1().getText();
		String expected1 = citacIzExela.getStringData("3 ninjas", 1, 1);
		Assert.assertEquals(actual1, expected1);
		Thread.sleep(1000);
		
		String actual2 = cartPage.assertPriceHappyNinja1().getText();
		String expected2 = String.valueOf(citacIzExela.getStringData("3 ninjas", 1, 2));
		Assert.assertEquals(actual2, expected2);
		Thread.sleep(1000);
		
		String actual3 = cartPage.assertNameHappyNinja2().getText();
		String expected3 = citacIzExela.getStringData("3 ninjas", 2, 1);
		Assert.assertEquals(actual3, expected3);
		Thread.sleep(1000);
		
		String actual4 = cartPage.assertPriceHappyNinja2().getText();
		String expected4 = String.valueOf(citacIzExela.getStringData("3 ninjas", 2, 2));
		Assert.assertEquals(actual4, expected4);
		Thread.sleep(1000);
		
		String actual5 = cartPage.assertNameNinjaSilhouette().getText();
		String expected5 = citacIzExela.getStringData("3 ninjas", 3, 1);
		Assert.assertEquals(actual5, expected5);
		Thread.sleep(1000);
		
		String actual6 = cartPage.assertPriceNinjaSilhouette().getText();
		String expected6 = citacIzExela.getStringData("3 ninjas", 3, 2);
		Assert.assertEquals(actual6, expected6);
		Thread.sleep(1000);
		}
	
	@Test (priority = 15)
	public void add2productsToCartAndRemove1() throws InterruptedException {

		shopPage.getHappyNinja1AddToCardButton().click();
		Thread.sleep(1000);
		shopPage.getHappyNinja2AddToCardButton().click();
		Thread.sleep(1000);
		mainPage.navigateToCartTab();
		Thread.sleep(2000);
		
		String actual1 = cartPage.assertNameHappyNinja1().getText();
		String expected1 = citacIzExela.getStringData("3 ninjas", 1, 1);
		Assert.assertEquals(actual1, expected1);
		Thread.sleep(1000);
		
		String actual2 = cartPage.assertPriceHappyNinja1().getText();
		String expected2 = String.valueOf(citacIzExela.getStringData("3 ninjas", 1, 2));
		Assert.assertEquals(actual2, expected2);
		Thread.sleep(1000);
		
		String actual3 = cartPage.assertNameHappyNinja2().getText();
		String expected3 = citacIzExela.getStringData("3 ninjas", 2, 1);
		Assert.assertEquals(actual3, expected3);
		Thread.sleep(1000);
		
		String actual4 = cartPage.assertPriceHappyNinja2().getText();
		String expected4 = String.valueOf(citacIzExela.getStringData("3 ninjas", 2, 2));
		Assert.assertEquals(actual4, expected4);
		Thread.sleep(1000);
		
		cartPage.deleteHappyNinja1().click();
		Thread.sleep(2000);
		
		boolean actual6 = cartPage.getRestoreItemLabel().isDisplayed();
		boolean expected6 = true;
		Assert.assertEquals(actual6, expected6);
		}
	
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
