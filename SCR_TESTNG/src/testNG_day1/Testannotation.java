package testNG_day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Testannotation {
  @Test
  public void test1() {
	  System.out.println("I am Test1");
  }
  
  @Test
  public void test2() {
	  System.out.println("I am test2");
  }
  // will execute before every testmethod
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am BM of Demo1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am AM demo1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am BC demo1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am AC demo1");
  }

}
