package AmazonAutomatePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPageAmezon  {
	
	 WebDriver driver;

	@FindBy(className="a-button-input")
    private WebElement clickOnProceedToBuy;
	
	public CartPageAmezon( WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void enterOnProceedToBuy() {
		clickOnProceedToBuy.click();
	}

}
