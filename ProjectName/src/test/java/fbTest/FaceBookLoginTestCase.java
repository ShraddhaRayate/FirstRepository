package fbTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseClassPackage.BaseClass;
import signup.FbSignUp;

public class FaceBookLoginTestCase extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRADDHA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();//Browser launch
			
			driver.get("https://www.facebook.com/"); //Url insert
			 Thread.sleep(4000);
		    
		    driver.manage().window().maximize(); //method chaining to browser maximize
		    Thread.sleep(4000);
		    
		    FbSignUp login = new FbSignUp(driver);
		   login.enterUserName();
		   login.enterPassword();
		   login.clickOnLogin();
		    
		    
	}
	

}
