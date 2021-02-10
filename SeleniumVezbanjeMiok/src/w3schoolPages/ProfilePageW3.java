package w3schoolPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePageW3 {
	WebDriver driver;
	//WebElement logOutBtn;
	
	public ProfilePageW3(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getLogOutBtn() {
		return driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div/span"));
	}
	
	public void navigateToLogOutBtn() {
		getLogOutBtn().click();
	}
	
}
