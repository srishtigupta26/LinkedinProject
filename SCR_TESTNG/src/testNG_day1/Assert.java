package testNG_day1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	@Test
	public void test1() {
		String check = "Hard Assertion";
		
		Assert.assertTrue(true);
		System.out.println("Passed 2");
		Assert.assertEquals("Hard", check);
		System.out.println("Passed");

		//String check = "Soft Assertion";
		//SoftAssert sf = new SoftAssert();

		//sf.assertEquals("Soft Assertion", check);
		//System.out.println("After equals");

		//sf.assertTrue(true);
		//System.out.println("After true");
		//sf.assertAll();

	}

	private static void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private static void assertEquals(String string, String check) {
		// TODO Auto-generated method stub
		
	}
}
