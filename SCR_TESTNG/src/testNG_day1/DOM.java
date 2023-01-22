package testNG_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DOM {
WebDriver driver;
	
	@Test(enabled = true)
	public void login() throws InterruptedException {
		driver.findElement(By.id("body_txtUserID")).sendKeys("donhere");
		driver.findElement(By.id("body_txtPassword")).sendKeys("don@123");
		Thread.sleep(3000);
		driver.findElement(By.id("body_btnLogin")).click();
		Thread.sleep(3000);
//		Assert.assertFalse(true);
	}

	@Test (dependsOnMethods ="login")
	public void accounts() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"AccountCustomer_ul\"]/li[1]/a")).click();
		Thread.sleep(3000);
	}
	
	@Test (priority = -1,enabled = false)
	public void test() {
		System.out.println("test1");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am BM");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srishti.gupta04\\Downloads\\chromedriver_108\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.82.180.36/Common/Login.aspx");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}