package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCSSselector {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/login");
Thread.sleep(4000);
driver.findElement(By.cssSelector("input[value='Log in']")).click();

}
}
