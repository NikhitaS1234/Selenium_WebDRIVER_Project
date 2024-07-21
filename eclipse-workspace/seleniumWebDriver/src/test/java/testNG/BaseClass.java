package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeMethod(alwaysRun =true)
	public void method1() {
		System.out.println("Inside before method");
	}

	@AfterMethod (alwaysRun =true)
	public void method2() {
		System.out.println("Inside after method");
	}

	@BeforeTest (alwaysRun =true)
	public void test1() {
		System.out.println("Inside before test");
	}
	
	@AfterTest (alwaysRun =true)
	public void test2() {
		System.out.println("Inside after test");
	}
	}
