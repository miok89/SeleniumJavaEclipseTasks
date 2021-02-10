package tools;
/*Domaci 28.1.2021.
•	Registrujte se MANUELNO na https://demoqa.com/register
•	Zatim napisati program koji ide na ovaj URL = https://demoqa.com/
•	Klikne na "Book Store Application"
•	Klikne na "Login"
•	Unese kredencijale sa kojima se korisnik registrovao u prvom koraku
•	Klikne na "Login" dugme
•	Assertuje da se korisnik ulogovao
•	Izloguje se
Sutra cu vam dati nastavak na ovaj domaci
Sve klase napisite u jednom package, taj package da se zove "tools".
-Prva klasa koja je homepage da se zove "pageTools",
-Druga klasa kada kliknete na biblioteku da se zove "pageBooks",
-Treca klasa kada odete na login da se zove "pageLogin" i
-Test klasa da se zove "testTools"
Obratite paznju na ove nazive da budu kao ovde navedeni, gledajte na to kao zahtev klijenta koji mora da se ispostuje (edited) 
Registered data	:
Marko
Miokovic
123456789
#mareCare21
Domaæi zadatak 29.01.2021.
Domaci nastavak od sinoc, juce ste se registrovali manuelno i automatski se ulogovali (i izlogovali), a sad imate sledece ali da napomenem prvo da ovu akciju log out ostavite za kraj, znaci ovo sta imate od danas stavite izmedju log in-a i log out-a:
•	Kada se ulogujete kliknite na dugme "Book Store"
•	Kliknite na koju god hocete knjigu
•	Tu knjigu dodate u kolekciju
•	Proverite na profilu da li vam se dodala ta knjiga
•	Stavite thread sleep 5 sekundi
•	Kliknite na "Delete All Books"
•	Proverite da li je knjiga (ili knjige, ako zelite mozete vezbati da dodate vise knjiga) obrisana sa naloga
•	Izlogujte se sa naloga
Za profil kreirajte klasu "pageProfile", ostale akcije pisite u pageBooks klasu koja je vec kreirana na jucerasnjem domacem zadatku

*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageTools {
	//home page
	WebDriver driver;
	WebElement bookStoreAplicationTab;
	
	public pageTools(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBookStoreAplicationTab() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]/h5"));	
	}
	
	public void navigateToBookStoreAplicationTab() {
		this.getBookStoreAplicationTab().click();
	}
}
