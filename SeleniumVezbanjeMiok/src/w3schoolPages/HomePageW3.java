package w3schoolPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageW3 {
	WebDriver driver;
	//WebElement logInBtn;
	//WebElement profileLogoBtn;
	//WebElement learnJavaLabel;
	//WebElement tutorialsTab;
	
	public HomePageW3(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLogInBtn() {
		return driver.findElement(By.id("w3loginbtn"));
	}
	
	public WebElement getProfileLogoBtn() {
		return driver.findElement(By.id("loginactioncontainer"));
	}
	
	public WebElement getLearnJavaLabel() {
		return driver.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/div/div[2]/a[10]"));
	}
	
	public WebElement getTutorialsTab() {
		return driver.findElement(By.id("navbtn_tutorials"));
	}
	
	public void navigateToLogInBtn() {
		getLogInBtn().click();
	}
	
	public void navigateToProfileLogoBtn() {
		getProfileLogoBtn().click();
	}
	
	public void navigateToLearnJavaLabel() {
		getLearnJavaLabel().click();
	}
	
	public void navigateToTutorialsTab() {
		getTutorialsTab().click();
	}
	
}
