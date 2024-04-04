package javascriptExecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.relay.Edge;

public class DisabledElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		//Edge driver=new Edge();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		
		//driver.switchTo().frame(0);
		//Thread.sleep(4000);
		//Alert a=driver.switchTo().alert();
		//a.accept();
		//driver.executeScript("window.scrollTo(0,400);");
	    //Thread.sleep(1000);
	    
	    //driver.findElement(By.linkText("Allow all cookies")).click();
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("id=\"u_0_k_oa\""));

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(8000);

		
		WebElement custom_gender = driver.findElement(By.name("custom_gender"));
		Thread.sleep(2000);


		driver.executeScript("arguments[0].value='selenium';",custom_gender );

		
		Thread.sleep(3000);
		//driver.quit();
	}
	}

