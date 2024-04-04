package WebDriver_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreen {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(4000);
	driver.get("https://www.shoppersstack.com/");
	driver.manage().window().fullscreen();
	Thread.sleep(6000);
	
}
}
