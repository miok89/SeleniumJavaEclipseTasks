package domaciZadatakS20;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZadatakYouTube {
/*Automatizovati youtube kroz sledece zahteve:
1) otici na sajt youtube
2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
// voditi racuna da ako postoje reklame da ih preskocite
Dodatni zadatak
Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video
*/
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.youtube.com/");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Rick Astley Never gonna give you up");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string")).click();
		Thread.sleep(15000);
		
		//driver.findElement(By.xpath("//*[@id=\"skip-button:6\"]/span/button"));
		
		driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-watch-flexy/div[5]/div[2]/div/div[3]/ytd-watch-next-secondary-results-renderer/div[2]/ytd-compact-autoplay-renderer/div[2]/ytd-compact-video-renderer/div[1]/div/div[1]/a/h3/span")).click();
		Thread.sleep(5000);
	
		//driver.findElement(By.xpath("//*[@id=\"skip-button:6\"]/span/button"));
		
		driver.close();
			
	}

}
