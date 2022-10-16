package fbTest;

import org.testng.annotations.Test;

public class PriorityTest {

//Priority	
	
	@Test(priority=1)
	public void TC02() {
		System.out.println("TC02");
	}
	
	@Test(priority=1)
	public void TC03() {
		System.out.println("TC03");
	}
	@Test(dependsOnMethods = "TC07", priority=3)
	public void TC01() {
		System.out.println("TC01");
	}
	
	@Test(priority=-1 , timeOut=2000)
	public void TC04() {
		System.out.println("TC04");
	}

//Invocation Count
	
	@Test(invocationCount=3)
	public void TC05() {
		System.out.println("TC05");
	}
	
//enabled = false
	@Test(enabled=false)
	public void TC06() {
		System.out.println("TC06");
	}

//dependsOnMethod
	
	@Test()
	public void TC07() {
		System.out.println("TCo7");
	}
	}
	

