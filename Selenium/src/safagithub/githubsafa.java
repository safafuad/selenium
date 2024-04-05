package safagithub;



	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class githubsafa {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
		    //EdgeDriver driver2=new EdgeDriver();
		    //FirefoxDriver driver3=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.quit();
		}
		}

