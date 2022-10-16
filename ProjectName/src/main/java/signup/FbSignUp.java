package signup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbSignUp {
	
	WebDriver driver;
	
	@FindBy(xpath = "")
	private WebElement userName;
	
	@FindBy(xpath = "")
	private WebElement passWord;
	
	@FindBy(xpath = "")
	private WebElement loginButton;
	
	public FbSignUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void enterUserName() {
		userName.sendKeys("rayateshraddha@gmail.com");
	}
	
	public void enterPassword() {
		passWord.sendKeys("shraddha@123");
	}
	
	public void clickOnLogin() {
		loginButton.click();
	}
	
	

}
