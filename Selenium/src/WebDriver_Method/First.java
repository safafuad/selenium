package WebDriver_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class First {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
   driver.get("https://www.selenium.dev/downloads/");
String title=driver.getTitle();
System.out.println(title);
}
}
