package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testcases.Baseclass;

public class LoginPage {

	WebDriver driver = Baseclass.driver;

	@FindBy(xpath = "//*[@id=\"login\"]/a")
	WebElement Login;

	@FindBy(id = "username")
	WebElement Uname;

	@FindBy(id = "password")
	WebElement Pwd;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[3]/div/input[2]")
	WebElement Loginbtn;

	@FindBy(id = "dropdownMenu1")
	WebElement Success;

	@FindBy(xpath = "/html/body/div/div[1]/div/div[1]/div/div")
	WebElement Fail;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public void loginmethod(String email, String pwd) {
		Login.click();
		Uname.sendKeys(email);
		Pwd.sendKeys(pwd);
		Loginbtn.click();

	}

	public void validateloginsucess(String msg) {

		String ActMsg1 = Success.getText();
		System.out.println(ActMsg1);
		Assert.assertEquals(msg, ActMsg1);

	}

	public void validateloginfailure(String msg) {

		String ActMsg1 = Fail.getText();
		System.out.println(ActMsg1);
		Assert.assertEquals(msg, ActMsg1);

	}

}
