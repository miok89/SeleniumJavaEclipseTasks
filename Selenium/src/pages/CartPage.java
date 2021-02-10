package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;
	WebElement flyngNinjaProductLabel;
	WebElement assertHappyNinja1;
	WebElement assertHappyNinja2;
	WebElement assertNinjaSilhouette;
	WebElement assertNameFlyngNinja;
	WebElement deleteFlyngNinja;
	WebElement deleteHappyNinja1;
	WebElement productRemoved;
	WebElement restoreItem;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement assertNameFlyngNinja() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	
	public WebElement deleteFlyngNinja() {
		return driver.findElement(By.className("remove"));
	}
	
	public WebElement deleteHappyNinja1() {
		return driver.findElement(By.className("remove"));
	}
	
	public WebElement getRestoreItemLabel() {
		return driver.findElement(By.className("restore-item"));
	}
	
	public WebElement getProductRemoved() {
		return driver.findElement(By.className("cart-empty woocommerce-info"));
	}
	
	public WebElement assertNameHappyNinja1() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	
	public WebElement assertPriceHappyNinja1() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[4]/span"));
	}
	
	public WebElement assertNameHappyNinja2() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td[3]/a"));
	}
	
	public WebElement assertPriceHappyNinja2() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[2]/td[4]/span"));
	}
	
	public WebElement assertNameNinjaSilhouette() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[3]/td[3]/a"));
	}
	
	public WebElement assertPriceNinjaSilhouette() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[3]/td[4]/span"));
	}
	
}
