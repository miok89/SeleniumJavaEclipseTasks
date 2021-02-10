package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageProfile {
	WebDriver driver;
	WebElement deleteAllBooksButton;
	WebElement profileTab;
	WebElement confirmButtonDelete;
	WebElement assertNameBook;
	WebElement assertDeleteNameBook;

	public pageProfile(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDeleteAllBooksButton() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/div[3]/button"));
	}

	public WebElement getProfileTab() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[6]/div/ul/li[3]/span"));
	}

	public WebElement getConfirmButtonDelete() {
		return driver.findElement(By.id("closeSmallModal-ok"));
	}

	public WebElement getAssertNameBook() {
		return driver.findElement(By.xpath(
				"/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div/span/a"));
	}

	public WebElement getAssertDeleteNameBook() {
		return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]"));
	}

	public void navigateToDeleteAllBooksButton() {
		this.getDeleteAllBooksButton().click();
	}

	public void navigateToProfileTab() {
		this.getProfileTab().click();
	}

	public void navigateToConfirmButtonDelete() {
		this.getConfirmButtonDelete().click();
	}

}
