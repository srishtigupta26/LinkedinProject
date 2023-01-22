package POM_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	private WebDriver driver;
	  
	public WebDriver getDriver() {
			return driver;
		}

	  @BeforeClass
	  public void beforeClass() {
		  intialize("http://10.82.180.36/Common/Login.aspx");
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	  
	  public void intialize(String url) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\srishti.gupta04\\Downloads\\chromedriver_108\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get(url);
	  }

	}
