package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageLogin {
	WebDriver driver;
	WebElement logInTab;
	WebElement userNameInputField;
	WebElement passwordNameInputField;
	WebElement logInButton;
	WebElement logOutButton;
	
	public pageLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLogInTab() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[1]"));
	}
	
	public WebElement getUserNameInputField() {
		return driver.findElement(By.id("userName"));
	}

	public WebElement getPasswordNameInputField() {
		return driver.findElement(By.id("password"));
	}
	
	public WebElement getLogInButton() {
		return driver.findElement(By.id("login"));
	}
	
	public WebElement getLogOutButton() {
		return driver.findElement(By.id("submit"));
	}
	
	public void navigateToLogInTab() {
		this.getLogInTab().click();
	}
	
	public void navigateToLogInButton() {
		this.getLogInButton().click();
	}
	
	public void navigateToLogOutButton() {
		this.getLogOutButton().click();
	}
	
	public void logIn(String korisnickoIme, String lozinka) throws InterruptedException {
		this.getUserNameInputField().clear();
		Thread.sleep(1000);
		this.getUserNameInputField().sendKeys(korisnickoIme);
		Thread.sleep(1000);
		this.getPasswordNameInputField().clear();
		Thread.sleep(1000);
		this.getPasswordNameInputField().sendKeys(lozinka);
		Thread.sleep(1000);
		this.navigateToLogInButton();
		Thread.sleep(1000);
	}
}
