package pages;

import testcases.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 WebDriver driver =BaseClass.driver;
	
	public  HomePage()
	{
		PageFactory.initElements(driver, this);
	}
}
