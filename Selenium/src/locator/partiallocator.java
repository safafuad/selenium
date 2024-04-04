package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallocator {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("WOMEN")).click();
			Thread.sleep(3000);
	//driver.findElement(By.name("password")).sendKeys("selenium123");
	//.Thread.sleep(4000);
	driver.quit();

}
}
