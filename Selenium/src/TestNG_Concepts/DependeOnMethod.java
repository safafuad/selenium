package TestNG_Concepts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependeOnMethod {
@Test
public void register_module() {
	Reporter.log("from register module",true);
}
@Test(dependsOnMethods = "register_module")
public void login_module() {
	Reporter.log("from login module",true);
}
}

