package domaciZadatakS21;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadatak1S21 {

	WebDriver driver;

	@BeforeClass
	public void preKlase() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
		Thread.sleep(2000);
	}

	@Test(priority = 0)
	public void assertInput() throws InterruptedException {
		
		//name assert
		WebElement nameText = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[1]/label"));
		
		String defaultName = nameText.getText();
		System.out.println(defaultName);
		Assert.assertEquals(defaultName, "Name *");
		
		//email assert
		WebElement emailText = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[2]/label"));
		
		String defaultEmail = emailText.getText();
		System.out.println(defaultEmail);
		Assert.assertEquals(defaultEmail, "E-mail *");
		
		//telphone assert
		WebElement telephoneText = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[3]/label"));
		
		String defaultTel = telephoneText.getText();
		System.out.println(defaultTel);
		Assert.assertEquals(defaultTel, "Telephone *");
		
		//country assert
		WebElement countryText = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[4]/label"));
		
		String defaultCountry = countryText.getText();
		System.out.println(defaultCountry);
		Assert.assertEquals(defaultCountry, "Country");
		
		//company assert
		WebElement companyText = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[5]/label"));
		
		String defaultCompany = companyText.getText();
		System.out.println(defaultCompany);
		Assert.assertEquals(defaultCompany, "Company");
		
		//message assert
		WebElement messageText = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/span/label"));
		
		String defaultMessage = messageText.getText();
		System.out.println(defaultMessage);
		Assert.assertEquals(defaultMessage, "Message");
		Thread.sleep(1000);
		
	}
	
	@Test(priority = 5)
	public void fillInput() throws InterruptedException {
		
		//name
		WebElement nameInputLbl = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[1]/input"));
		
		String tekstNameLbl = nameInputLbl.getText();
		Assert.assertNotEquals(null, tekstNameLbl);
		
		nameInputLbl.sendKeys("Marko Miokovic");
		Thread.sleep(1000);
		
		//email
		WebElement emailInputLbl = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/aside/div/section[2]/form/div/span[2]/input"));
		Thread.sleep(2000);

		String tekstEmailLbl = emailInputLbl.getText();
		Assert.assertNotEquals(null, tekstEmailLbl);
		
		emailInputLbl.sendKeys("marko.miok@gmail.com");
		Thread.sleep(1000);
		
		//telphone
		WebElement telephoneInputLbl = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[3]/input"));
		
		String telephoneNameLbl = telephoneInputLbl.getText();
		System.out.println(telephoneNameLbl);
		Assert.assertNotEquals(null, telephoneNameLbl);
		
		telephoneInputLbl.sendKeys("0605553003");
		Thread.sleep(1000);
		
		//country
		WebElement countryInputLbl = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[4]/input"));
		
		String countryNameLbl = countryInputLbl.getText();
		Assert.assertNotEquals(null, countryNameLbl);
		
		countryInputLbl.sendKeys("Serbia");
		Thread.sleep(1000);
		
		//company
		WebElement companyInputLbl = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/div/span[5]/input"));
		
		String companyNameLbl = companyInputLbl.getText();
		Assert.assertNotEquals(null, companyNameLbl);
		
		companyInputLbl.sendKeys("MM traders");
		Thread.sleep(1000);
		
		//message
		WebElement messageInputLbl = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/span/textarea"));
		
		String messageNameLbl = messageInputLbl.getText();
		Assert.assertNotEquals(null, messageNameLbl);
		
		messageInputLbl.sendKeys("Hi how are you?");
		Thread.sleep(1000);
		
		//submit
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/p/a[1]"));
		
		submitBtn.click();
		Thread.sleep(3000);	
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
	}
}
