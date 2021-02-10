package domaciZadatakS18Dodatno;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSajt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"item-2\"]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[2]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[4]/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"item-3\"]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Jovan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Whitefield");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("marko.miok@gmail.com");;
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("3");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("50000");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("IT");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body")).click();
		driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("/html/body")).sendKeys(Keys.ARROW_DOWN);
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
