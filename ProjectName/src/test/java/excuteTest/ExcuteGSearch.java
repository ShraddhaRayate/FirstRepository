package excuteTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoggleSearchHome;

public class ExcuteGSearch {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRADDHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// Browser launch
		driver.get("https://www.google.com");
		
		GoggleSearchHome homePage = new GoggleSearchHome(driver);
		homePage.SearchText.sendKeys("Laptop");
		
	}

}
