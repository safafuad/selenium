package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	driver.findElement( By.className("email")).sendKeys("selenium@gmail.com");
	driver.findElement( By.className("password")).sendKeys("selenium@gmail.com");
			Thread.sleep(3000);
	
	driver.quit();
}
}
