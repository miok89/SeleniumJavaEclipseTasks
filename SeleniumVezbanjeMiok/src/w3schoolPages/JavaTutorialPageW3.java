package w3schoolPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaTutorialPageW3 {
	WebDriver driver;
	//WebElement startLearningJavaBtn;
	//WebElement assertJavaTutorialLabel;
	
	public JavaTutorialPageW3(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getStartLearningJavaBtn() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/a"));
	}
	
	public WebElement getAssertJavaTutorialLabel() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/h2[1]"));
	}
	
	
	public void navigateToStartLearningJavaBtn() {
		getStartLearningJavaBtn().click();
	}
	
}
