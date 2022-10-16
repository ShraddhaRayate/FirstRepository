package AmazonAutomatePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageAmezon {
	
	 WebDriver driver;
	
	@FindBy(className="nav-line-1 nav-progressive-content")
    private WebElement SignIn;
	
	@FindBy(xpath="//input[@type='email']")
    private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
    private WebElement password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signInButton;
	
	public LoginPageAmezon( WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void ClickOnSignIn() {
		SignIn.click();
	}
	
	public void enterUserName() {
		email.sendKeys("9158576752");
	}
	
	public void enterPassword() {
		password.sendKeys("Shraddha@12345");
	}
	
	public void clickOnLogin() {
		signInButton.click();
	}
}
