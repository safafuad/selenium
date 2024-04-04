package WebDriver_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
System.out.println("First time:"+driver.getTitle());
Thread.sleep(3000);
driver.findElement(By.linkText("Log in")).click();
System.out.println("After clicking login button:"+driver.getTitle());
Thread.sleep(3000);
driver.navigate().back();
System.out.println("after clicking back button:"+driver.getTitle());
Thread.sleep(3000);
driver.navigate().forward();
System.out.println("After clicking forward button:"+driver.getTitle());
Thread.sleep(3000);
driver.navigate().to("https://demowebshop.tricentis.com/");
System.out.println("After to performin:"+driver.getTitle());
driver.quit();
}
}
