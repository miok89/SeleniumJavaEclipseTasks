package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testTools {
	WebDriver driver;
	pageTools pageTools;
	pageBooks pageBooks;
	pageLogin pageLogin;
	pageProfile pageProfile;
	

	@BeforeClass
	public void preKlase() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		this.driver = new ChromeDriver();
		this.pageTools = new pageTools(driver);
		this.pageBooks = new pageBooks(driver);
		this.pageLogin = new pageLogin(driver);
		this.pageProfile = new pageProfile(driver);
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(2000);
	}

	@Test(priority = 0)
	public void dodavanjeIbrisanjeKnjige() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", pageTools.getBookStoreAplicationTab());
		Thread.sleep(1000);
		
		pageTools.navigateToBookStoreAplicationTab();
		Thread.sleep(1000);
		//Registered data: Marko Miokovic; username: 123456789; Password: #mareCare21
		js.executeScript("arguments[0].scrollIntoView();", pageLogin.getLogInTab());
		Thread.sleep(1000);
		
		pageLogin.navigateToLogInTab();
		
		pageLogin.logIn("123456789", "#mareCare21");
		
		String textForAssert = pageLogin.getLogOutButton().getText();
		//System.out.println(textForAssert);
		Assert.assertEquals(textForAssert, "Log out");
		System.out.println("Potvrdjeno da smo ulogovani");
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView();", pageBooks.getBookStoreTab());
		Thread.sleep(1000);
		pageBooks.navigateBookStoreTab();
		Thread.sleep(2000);
		
		pageBooks.navigateToBookSpeakingJavaScript();
		Thread.sleep(2000);
		
		pageBooks.navigateToAddToYourCollectionButton();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView();", pageProfile.getProfileTab());
		Thread.sleep(1000);
		pageProfile.navigateToProfileTab();
		Thread.sleep(2000);
		
		// assert da li je dodata knjiga mora uzimati tekst knjige iz pageProfile, a ne iz pageBooks iako su isti
		//path-ovi! Ne znam zasto, ali jedino tako radi!
		String dodataKnjiga = pageProfile.getAssertNameBook().getText();
		//System.out.println(textTitleBook);
		Assert.assertEquals(dodataKnjiga, "Speaking JavaScript");
		Thread.sleep(5000);
		System.out.println("Potvrdjeno dodavanje knjige");
		
		pageProfile.navigateToDeleteAllBooksButton();
		Thread.sleep(2000);
		pageProfile.navigateToConfirmButtonDelete();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//assert da li je knjiga obrisana
		String obrisnaKnjiga = pageProfile.getAssertDeleteNameBook().getText();
		//System.out.println(textTitleBook);
		Assert.assertNotEquals(obrisnaKnjiga, "Speaking JavaScript");
		Thread.sleep(5000);
		System.out.println("Potvrdjeno brisanje knjige");
		
		pageLogin.navigateToLogOutButton();
		Thread.sleep(1000);
		System.out.println("Uspesno prosao test");

	
	}

	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@AfterClass
	public void posleKlase() {
		driver.close();
		System.out.println("Zatvoreno iz after metode");
	}
}
