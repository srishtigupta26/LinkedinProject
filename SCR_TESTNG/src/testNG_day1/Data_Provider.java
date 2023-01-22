package testNG_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	WebDriver driver;

	@Test(dataProvider = "credentials")
	public void f(String user, String pass, String ex) throws InterruptedException {
		driver.findElement(By.id("body_txtUserID")).sendKeys(user);
		driver.findElement(By.id("body_txtPassword")).sendKeys(pass);
		Thread.sleep(3000);
		driver.findElement(By.id("body_btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("lbLoginOut")).click();
		System.out.println(ex);
	}

//	@DataProvider
//	public Object[][] dp() {
//		return new Object[][] { 
//			new Object[] { "donhere", "don@123" }, 
//			new Object[] { "DONHERE", "don@123" },
//			new Object[] {"donHere" , "don@123"}
//			};
//	}

	@DataProvider (name = "credentials")
	public Object[][] dp(){
		Object[][] ob = new Object[3][3]; //1-> set of data, 2->no. of parameters
		
		ob[0][0] ="donhere";
		ob[0][1] ="don@123";
		ob[0][2] ="one";
		
		ob[1][0] ="DONHERE";
		ob[1][1] ="don@123";
		ob[1][2] ="two";
				
		ob[2][0] ="donHere";
		ob[2][1] ="don@123";
		ob[2][2] ="three";
		
		return ob;
	}
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srishti.gupta04\\Downloads\\chromedriver_108\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.82.180.36/Common/Login.aspx");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}

