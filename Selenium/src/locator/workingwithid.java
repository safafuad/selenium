package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithid {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/login");
Thread.sleep(3000);
driver.findElement(By.id("Email")).sendKeys("selenium@gmail.com");
Thread.sleep(4000);
driver.findElement(By.id("Password")).sendKeys("selenium123");
Thread.sleep(4000);
driver.quit();
}
}
