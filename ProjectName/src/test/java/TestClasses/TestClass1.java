package TestClasses;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@Test(groups = "regression1")
	public void TC01() {
		System.out.println("TestClass TC01");
	}
	
	@Test(groups = "regression2")
	public void TC02() {
		System.out.println("TstClass TC02");
	}
	
	@Test
	public void TC03() {
		System.out.println("TestClass TC03");
	}
	
	@AfterMethod
	public void FailTestScreenShot(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			//call here to screenshot Method
		}
		
	}

}
