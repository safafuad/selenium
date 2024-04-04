package datprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.emitter.Emitable;

public class DWS_Registration 
{	
	@DataProvider
public String[][] m1() throws EncryptedDocumentException, IOException, InterruptedException {
File f=new File("./resources/Worksheet.xlsx");
FileInputStream fis=new FileInputStream(f);

Workbook wb=WorkbookFactory.create(f);
int row_count = wb.getSheet("Sheet2").getPhysicalNumberOfRows();
System.out.println(row_count);
int cell_count = wb.getSheet("Sheet2").getRow(1).getPhysicalNumberOfCells();
System.out.println(cell_count);

String [][] arr1=new String[row_count][cell_count];



for(int i=0;i<row_count;i++) {
	for(int j=0;j<cell_count;j++) {
                System.out.print(arr1[i][j]+"   ");//all "null" not initialised yet
		arr1[i][j]=wb.getSheet("Sheet2").getRow(i).getCell(j).toString();//initialising
		System.out.print(arr1[i][j]+"   ");//respective values
	}
	System.out.println();
}
return arr1;
}
	
@Test(dataProvider =  "m1")
public void DWS_Registration(String[] arr) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/register");
if(arr[0].equalsIgnoreCase("female")) {
WebElement gender_female = driver.findElement(By.id("gender-female"));
gender_female.click();
}
if(arr[0].equalsIgnoreCase("male")) {
WebElement gender_male = driver.findElement(By.id("gender-male"));
gender_male.click();
}
WebElement fname = driver.findElement(By.id("FirstName"));
fname.sendKeys(arr[1]);
WebElement lname = driver.findElement(By.id("LastName"));
lname.sendKeys(arr[2]);
WebElement email = driver.findElement(By.id("Email"));
email.sendKeys(arr[3]);
WebElement password = driver.findElement(By.id("Password"));
password.sendKeys(arr[4]);
WebElement confirm_password = driver.findElement(By.id("ConfirmPassword"));
confirm_password.sendKeys(arr[4]);
Thread.sleep(1000);
driver.findElement(By.id("register-button")).click();
driver.quit();
}
}