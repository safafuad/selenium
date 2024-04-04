package TestNG_Concepts;


	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class InvocationCount {
	@Test(invocationCount = 3)
	public void demo_02() throws InterruptedException {
		Reporter.log("hi testng2",true);//on console
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	@Test(priority = -1 )
	public void demo_01() {
		Reporter.log("hi testng1",true);//on console
	}
	}


