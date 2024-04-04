package TestNG_Concepts;

import org.testng.annotations.Test;

import org.testng.Reporter;
public class ToCheckTestNG {
	@Test
	public void Demo_01() {
		Reporter.log("hi TestNg");
		Reporter.log("hi testNg");
	}
@Test(priority=-1)
public void Demo_02() {
	Reporter.log("hi testng1");
	Reporter.log("hi testNg");
}
}
