package Simply;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ToWorkWithLogin {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		SoftAssert sa=new SoftAssert();

		driver.get("https://demowebshop.tricentis.com/login");
		sa.assertEquals(driver.getTitle(), "Demo Web Shop Login", "not landed to required page");
		WebElement Rem_btn = driver.findElement(By.id("RememberMe"));
		Rem_btn.click();
		sa.assertFalse(Rem_btn.isSelected(), "Remember check box is already selected");;
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("selenium4444@gmail.com");
		sa.assertEquals(email.getAttribute("value"),"selenium4444@gmail.com","email is not same as expected");
		Thread.sleep(4000);
		sa.assertAll();//error browser not close
		driver.quit();


	}

}
