package TestNG_Concepts;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class PriorityOfMethod {
	

	
	public void demo_02() {//testng method/test case
		//int a=10/0;//test steps
		Reporter.log("hi testng2");//on report
		Reporter.log("hi testng2",true);//on console
	}
	@Test(priority = -1 )
	public void demo_01() {//testng method/test case
		//int a=10/0;//test steps
		Reporter.log("hi testng1");//on report
		Reporter.log("hi testng1",true);//on console
	}
	@Test(priority = -1 )
	public void demo_03() {//testng method/test case
		//int a=10/0;//test steps
		Reporter.log("hi testng1");//on report
		Reporter.log("hi testng3",true);//on console
	}
	@Test(priority = -1 )
	public void demo_04() {//testng method/test case
		//int a=10/0;//test steps
		Reporter.log("hi testng1");//on report
		Reporter.log("hi testng4",true);//on console
	}
	}


