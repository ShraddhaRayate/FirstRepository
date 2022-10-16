package BaseClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHRADDHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();// Browser launch
	}else if(browser.equalsIgnoreCase("FireFox")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHRADDHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 driver = new FirefoxDriver();// Browser launch
		
	}
		driver.manage().window().maximize();
		//implicit wait
	}
}
