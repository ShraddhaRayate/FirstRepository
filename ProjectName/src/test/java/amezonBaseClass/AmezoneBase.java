package amezonBaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmezoneBase {
	
public static WebDriver driver;
	
	public void launchBrowser(String browser) {
				
       
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHRADDHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();// Browser launch

		 driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		//implicit wait
}

}
