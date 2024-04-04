package WebDriver_Method;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTimeout {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(48));
	
	WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(2));
	driver.get("https://www.shoppersstack.com/");
	explicitwait.until(ExpectedConditions.urlToBe("https://www.shoppersstack.com/"));
	
	driver.findElement(By.xpath("//span[text()='SAMSUNG']")).click();
	driver.findElement(By.id("Check Delivery")).sendKeys("123456");
	
	WebElement check_box_button = driver.findElement(By.id("Check"));
	explicitwait.until(ExpectedConditions.elementToBeClickable(check_box_button));
	check_box_button.click();
	
	driver.quit();
	}

}
