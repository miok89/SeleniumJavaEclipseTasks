package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {
	WebDriver driver;
	WebElement flyngNinjaAddToCardButton;
	WebElement HappyNinja1AddToCardButton;
	WebElement HappyNinja2AddToCardButton;
	WebElement NinjaSilhouetteAddToCardButton;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFlyngNinjaAddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
	}
	
	public WebElement getHappyNinja1AddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[2]/div/a[2]"));
	}
	
	public WebElement getHappyNinja2AddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[3]/div/a[2]"));
	}
	
	public WebElement getNinjaSilhouetteAddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[4]/div/a[2]"));
	}
	
}
