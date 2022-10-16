package TestGoogleSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoggleSearch {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRADDHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// Browser launch

		// open google
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("HP laptops");
		search.submit();
		

	}

}
