package fbTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import signup.FbSignUp;

public class Annotaion {
	WebDriver driver;
	FbSignUp login;

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHRADDHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    driver = new ChromeDriver();// Browser launch
		
		 driver.get("https://accounts.google.com/signin");
	     login = new FbSignUp(driver);
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod");
	}
	
	@Test
	public void TC01() {
		System.out.println("TestCase01");
	}
	
	@Test
	public void TC02() {
		System.out.println("TestCase02");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("LogOut");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close");
	}
}
