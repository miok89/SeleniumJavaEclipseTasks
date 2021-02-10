package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	WebDriver driver;
	WebElement logInButton;
	WebElement userNameInputField;
	WebElement passwordNameInputField;
	WebElement logOutLabel;
	WebElement noCredentialsLabel;
	WebElement wrongCredentialsLabel;

	public WebElement getLogInButton() {
		return driver.findElement(By.name("login"));
	}

	public WebElement getUserNameInputField() {
		return driver.findElement(By.id("username"));
	}

	public WebElement getPasswordNameInputField() {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getLogOutLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a"));
	}
	
	public WebElement getNoCredentialsLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li"));
	}
	
	public WebElement getWrongCredentialsLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/ul/li"));
	}
	
	public MyAccountPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void logInButtonClick() {
		this.getLogInButton().click();
	}
	
	public void logIn(String korisnickoIme, String lozinka) throws InterruptedException {
		this.getUserNameInputField().clear();
		this.getUserNameInputField().sendKeys(korisnickoIme);
		Thread.sleep(2000);
		this.getPasswordNameInputField().clear();
		this.getPasswordNameInputField().sendKeys(lozinka);
		Thread.sleep(2000);
		this.getLogInButton().click();
	}

}
