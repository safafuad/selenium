package Scripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToLaunchApp_03 {
@Test(groups="mobile")
public void launch_app() {
	ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
driver.get("https://www.vivo.com/uk");
driver.quit();
}
}
