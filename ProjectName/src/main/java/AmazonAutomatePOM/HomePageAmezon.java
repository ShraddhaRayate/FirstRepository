package AmazonAutomatePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAmezon {
	
 WebDriver driver;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
    private WebElement searchText;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
    private WebElement clickSearch;
	
	@FindBy(xpath="Apple iPhone 12 (128GB) - Blue")
    private WebElement clickOnMobile;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
    private WebElement clickOnAddToCart;
	
	public HomePageAmezon(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void enterTextOnSearchTab() {
		searchText.sendKeys("iphone 12");
	}
	
	public void enterSearchIcon() {
		clickSearch.click();
	}
	
	public void clickOnMobileField() {
		clickOnMobile.click();
	}
	
	public void clickOnAddCart() {
		clickOnAddToCart.click();
	}
	
	

}
