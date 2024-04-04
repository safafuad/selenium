package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	
		public static void main(String[] args) throws InterruptedException {
				
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://optellum.com");
				Thread.sleep(3000);
				
				//WebElement button = driver.findElement(By.id("searchform-dropdown"));
				WebElement searchInput = driver.findElement(By.id("searchform-dropdown"));
				searchInput.click();
}
	}

