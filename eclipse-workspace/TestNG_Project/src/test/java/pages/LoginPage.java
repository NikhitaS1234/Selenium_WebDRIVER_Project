package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testcases.BaseClass;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = BaseClass.driver;

	@FindBy(linkText = "Log in")
	WebElement LoginLink;

	@FindBy(name = "user_login")
	WebElement UserNAME;

	@FindBy(id = "password")
	WebElement passWord;

	@FindBy(id = "remember-me")
	WebElement checkBox;

	@FindBy(name = "btn_login")
	WebElement LoginClick;
	
	@FindBy(className = "error_msg")
	WebElement Errormsz;

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	public void LoginFunction(String UserNameVal1, String PwdVal) {

		LoginLink.click();

		UserNAME.sendKeys("abc@gmail.com");

		passWord.sendKeys("Abc1234@");

		checkBox.click();

		LoginClick.click();
	}

	public void ValidateErrorMsg(String ExpMsg) 
	{
		// TODO Auto-generated method stub
		String ActMsg =Errormsz.getText();
		Assert.assertEquals(ExpMsg, ActMsg);
	}

}
