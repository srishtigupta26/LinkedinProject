package POM_demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_LoginPage extends BaseClass{
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  Login log = new Login(driver);
		  log.login_into_app("donhere", "don@123");
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		 super.beforeClass();
		  //super.beforeClass();
		  driver = getDriver();
	  }
}