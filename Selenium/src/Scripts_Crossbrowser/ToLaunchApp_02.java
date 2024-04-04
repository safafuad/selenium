package Scripts_Crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToLaunchApp_02 {
	
	@Parameters("browsername")
@Test
public void launch_app(String browsername) {
	WebDriver driver=null;
	if(browsername.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
}
else if(browsername.equalsIgnoreCase("Edge")) {
 driver = new EdgeDriver();
}
else if(browsername.equalsIgnoreCase("Firefox")){
driver=new FirefoxDriver();
}
else {
	System.out.println("Invalid browsername");
	//ChromeDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
driver.get("https://oppostore.co.uk/");
driver.quit();
}
}
}
