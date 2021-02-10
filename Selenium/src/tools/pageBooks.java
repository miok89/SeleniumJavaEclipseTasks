package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageBooks {
	WebDriver driver;
	WebElement bookStoreTab;
	WebElement bookSpeakingJavaScript;
	WebElement addToYourCollectionButton;
	
	public pageBooks(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBookStoreTab() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[2]/span"));
	}
	
	public WebElement getBookSpeakingJavaScript() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/div/div[2]/div/span/a"));
}											
	
	public WebElement getAddToYourCollectionButton() {
		
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[9]/div[2]/button"));
	}

	public void navigateBookStoreTab() {
		this.getBookStoreTab().click();
	}
	
	public void navigateToBookSpeakingJavaScript() {
		this.getBookSpeakingJavaScript().click();
	}
	
	public void navigateToAddToYourCollectionButton() {
		this.getAddToYourCollectionButton().click();
	}
}
