package w3schoolPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageW3 {
	WebDriver driver;
	//WebElement logInButton;
	//WebElement username;
	//WebElement password;

	public LogInPageW3(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getUsername() {
		return driver.findElement(By.name("n"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.name("p"));
	}

	public WebElement getLogInButton() {
		return driver.findElement(By.id("login_submit_button"));
	}

	public void navigateToUsername() {
		getUsername().click();
	}

	public void navigateToPassword() {
		getPassword().click();
	}

	public void navigateTologInButton() {
		getLogInButton().click();
	}
	
	public void logIn(String username, String password) throws InterruptedException {
		this.getUsername().clear();
		this.getUsername().sendKeys(username);
		Thread.sleep(2000);
		this.getPassword().clear();
		this.getPassword().sendKeys(password);
		Thread.sleep(2000);
		this.getLogInButton().click();
	}

}
