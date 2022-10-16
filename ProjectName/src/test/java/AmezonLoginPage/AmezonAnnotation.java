package AmezonLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import AmazonAutomatePOM.CartPageAmezon;
import AmazonAutomatePOM.HomePageAmezon;
import AmazonAutomatePOM.LoginPageAmezon;
import amezonBaseClass.AmezoneBase;

public class AmezonAnnotation extends AmezoneBase {
	
	public LoginPageAmezon login;
	public HomePageAmezon Home;
	public CartPageAmezon cart;
	
	@BeforeClass
	public void launchBrowser() {
		launchBrowser("chrome");
		/*
		 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHRADDHA\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();// Browser launch
		driver.manage().window().maximize();
		 */
		
		 login = new LoginPageAmezon(driver);
		 Home = new HomePageAmezon(driver);
		 cart = new CartPageAmezon(driver);
	}
	
	@BeforeMethod
	public void LoginPage() {
		login.ClickOnSignIn();
		login.enterUserName();
		login.enterPassword();
		login.clickOnLogin();
		
	}
	
	
	
	

}
