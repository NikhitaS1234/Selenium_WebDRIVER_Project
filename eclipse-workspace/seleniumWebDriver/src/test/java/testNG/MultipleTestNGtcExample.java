package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTestNGtcExample extends BaseClass {
	
	
	@Test (enabled =true)
	public void TestCase_02() {
		System.out.println("Inside TC02");
	}

	@Test
	public void TestCase_03() {
		System.out.println("Inside TC03");
	}

	@Test
	public void TestCase_04() {
		System.out.println("Inside TC04");
	}
}
