package domaciZadatakS19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/*Napisite program gde korisnik: Ide ponovo na sajt https://demoqa.com/ , 
 * ide na Elements, ide na Buttons, klikne dugme "Click me" i u programu 
 * stampa koju poruku je dobio ispod dugmeta. Nakon toga obrisati sve 
 * cookies i zatvoriti program.*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1S19 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"item-4\"]/span")).click();
		Thread.sleep(2000);
		//kod ispod nece sa relativnim x.path-om da radi, samo sa apsolutnim!
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/button")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//*[@id=\"dynamicClickMessage\"]")).getText();
		Thread.sleep(2000);
		System.out.println(text);
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}

}
