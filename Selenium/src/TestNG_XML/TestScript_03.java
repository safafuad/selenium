package TestNG_XML;

import org.testng.annotations.Test;

public class TestScript_03 extends Baseclass {
	@Test
	public void FT_01() {
		driver.get("https://demowebshop.tricentis.com/books");
	BookPage_WebElements books=new BookPage_WebElements(driver);
	books.getBook1().click();
	}

}
