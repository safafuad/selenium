package WebDriver_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
Thread.sleep(4000);
driver.manage().window().maximize();
driver.get("https://www.shoppersstack.com/");

}
}
