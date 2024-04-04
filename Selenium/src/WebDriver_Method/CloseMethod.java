package WebDriver_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(5000);
	driver.close();
}
}
