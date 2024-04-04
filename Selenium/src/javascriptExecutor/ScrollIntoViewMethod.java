package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewMethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
    Thread.sleep(3000);
   
    WebElement ele1=driver.findElement(By.linkText("Build your own computer"));
    driver.executeScript("arguments[0].scrollIntoView(true);",ele1);
Thread.sleep(3000);
//driver.quit();
}
}
