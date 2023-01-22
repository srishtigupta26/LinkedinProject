package testNG_day1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Group {
	WebDriver driver;

	@Test (groups = {"g1"})
	public void test1() {
		System.out.println("I am test1");
	}
	
	@Test(groups = {"g1", "g2"})
	public void test2() {
		System.out.println("I am test2");
	}
	
	@Test (groups = "g2")
	public void test3() {
		System.out.println("I am test3");
	}
	
	@Test (groups = "g3")
	public void test4() {
		System.out.println("I am test4");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am BC");
	
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am AC");
	}

}

