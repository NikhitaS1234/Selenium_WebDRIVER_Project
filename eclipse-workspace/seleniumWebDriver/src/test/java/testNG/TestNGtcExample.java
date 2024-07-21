package testNG;

import org.testng.annotations.Test;

public class TestNGtcExample extends BaseClass {
	
	@Test(groups= {"regression","group1"})
	public void TestCase_01()
	{
		System.out.println("Inside TC01");
	}

}
