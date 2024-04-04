package WebDriver_Method;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeDimension {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(4000);
	driver.get("https://www.shoppersstack.com/");
	driver.manage().window().maximize();
	Dimension size=driver.manage().window().getSize();	
System.out.println(size);
int height=driver.manage().window().getSize().getHeight();
System.out.println("Height:"+height);
int width=driver.manage().window().getSize().getWidth();
System.out.println("Width:"+width);
Thread.sleep(6000);
driver.quit();

}
}
