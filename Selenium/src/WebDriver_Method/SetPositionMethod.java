package WebDriver_Method;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/");
	Point p=new Point(150,80);
	driver.manage().window().setPosition(p);
}
}
