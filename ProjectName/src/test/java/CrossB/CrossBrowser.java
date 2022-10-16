package CrossB;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import BaseClassPackage.BaseClass;
import fbTest.FaceBookLoginTestCase;

public class CrossBrowser extends BaseClass {
	FaceBookLoginTestCase login;
	
	@Parameters("browsers")
	@BeforeClass
	public void launchB(String browser) {
		
		launchBrowser(browser);
		
		login = new FaceBookLoginTestCase(driver);
		
	}
	

}
