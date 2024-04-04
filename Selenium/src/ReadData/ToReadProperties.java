package ReadData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadProperties {
public static void main(String[] args) throws IOException {
	File file=new File("./resources/fileproperties.properties");
	
	FileInputStream fis=new FileInputStream(file);
	
	Properties prop=new Properties(); 
	prop.load(fis);
	
	String url=prop.getProperty("url");
	System.out.println(url);
	
	System.out.println(prop.getProperty("login"));
	
	ChromeDriver driver=new ChromeDriver();
	driver.get(url);
	
}
}
