package WebDriver_Method;



import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionMethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.shoppersstack.com/");
    driver.manage().window().maximize();
    Thread.sleep(6000);
    Point axis_values=driver.manage().window().getPosition();
    System.out.println(axis_values);
    int x_axis=driver.manage().window().getPosition().getX();
    System.out.println("X-axis value:"+x_axis);
    int y_axis=driver.manage().window().getPosition().getY();
    System.out.println("Y-Axis:"+y_axis);
    Thread.sleep(4000);
    driver.quit();

}
}
