package WebDriver_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
    Thread.sleep(4000);
    driver.findElement(By.id("compare")).click();
    Thread.sleep(3000);
    driver.quit();
}
}
