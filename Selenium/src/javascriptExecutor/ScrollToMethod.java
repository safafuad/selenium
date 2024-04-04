package javascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToMethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/fiction");
    Thread.sleep(3000);
    
    driver.executeScript("window.scrollTo(0,500);");
    Thread.sleep(2000);
    
    driver.executeScript("window.scrollTo(0,-400);");
    Thread.sleep(3000);
    
    driver.quit();

}
}
