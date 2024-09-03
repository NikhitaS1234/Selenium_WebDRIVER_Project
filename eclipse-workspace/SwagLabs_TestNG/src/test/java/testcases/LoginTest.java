package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void TC01_LoginSuccessTest() {

		LoginPage lp = new LoginPage();
		HomePage hp = new HomePage();
		lp.LoginFunction("standard_user", "secret_sauce");
		hp.verifyHomePage();

	}

	@Test
	public void TC02_LoginFailureTest() {

		LoginPage lp = new LoginPage();
		lp.LoginFunction("standard_user", "Abcd@1234");
		lp.ValidateErrorMsg("Epic sadface: Username and password do not match any user in this service");

	}


	@Test
	public void TC03_LockedUserTest() {
		LoginPage lp = new LoginPage();
		lp.LoginFunction("locked_out_user", "secret_sauce");
		lp.ValidateErrorMsg("Epic sadface: Sorry, this user has been locked out.");
	}
}
