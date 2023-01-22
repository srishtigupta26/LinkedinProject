package POM_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login {
	private WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public void login_into_app(String username,String password) throws InterruptedException {
		driver.findElement(By.id("body_txtUserID")).sendKeys(username);
		driver.findElement(By.id("body_txtPassword")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("body_btnLogin")).click();
		Thread.sleep(3000);
	}
	
	

}
