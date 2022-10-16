package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertClassHardSoft {
	String expUrl = "Google.com";
	String actUrl = "Google.com";
	String actUrl2 = "google.com";

	SoftAssert soft = new SoftAssert();

	@Test
	public void TC01() {

		Assert.assertEquals(actUrl, expUrl);
		System.out.println("Assertion1");
		Assert.assertNotEquals(actUrl2, actUrl);
		System.out.println("Assertion2");
		Assert.assertEquals(expUrl, actUrl);
		System.out.println("Assertion3");
		Assert.assertFalse(false);
		System.out.println("Assertion4");
		Assert.assertTrue(true);
		System.out.println("Assertion5");
		//Assert.fail();
	}

	@Test
	public void TC02() {
		soft.assertEquals(actUrl, expUrl);
		System.out.println("Soft Assert1");
		soft.assertNotEquals(actUrl, actUrl2);
		System.out.println("Soft Assert2");
		soft.assertFalse(false);
		System.out.println("Soft Assert3");
		soft.assertTrue(true);
		System.out.println("Soft Assert4");
		// soft.fail();
		soft.assertAll();
		System.out.println("done");
	}

}
