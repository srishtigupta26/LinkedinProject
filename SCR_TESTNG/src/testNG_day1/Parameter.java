package testNG_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver driver;

	@Test
	@Parameters({"UN","PW"})
	public void test(@Optional("DONHERE")String username, @Optional("don@123")String password) throws InterruptedException {
		driver.findElement(By.id("body_txtUserID")).sendKeys(username);
		driver.findElement(By.id("body_txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("body_btnLogin")).click();
		Thread.sleep(3000);
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am BM");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srishti.gupta04\\Downloads\\chromedriver_108\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.82.180.36/Common/Login.aspx");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am AM");
		driver.close();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am BC");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am AC");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am BT");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am AT");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am BS");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am AS");
	}

}
