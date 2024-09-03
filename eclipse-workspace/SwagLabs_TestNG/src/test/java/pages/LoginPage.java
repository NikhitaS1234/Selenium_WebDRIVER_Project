package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testcases.BaseClass;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	WebDriver driver = BaseClass.driver;
		// TODO Auto-generated method stub

	@FindBy(name = "user-name")
	WebElement UserNAME;
	
	@FindBy(id = "password")
	WebElement passWord;
	
	@FindBy(id = "login-button")
	WebElement LoginClick;
	
	@FindBy(xpath = "//h3[@data-test='error']")
	WebElement Errormsz;
	
	
	
public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public void LoginFunction(String userNameVal1, String pwdVal) {
	// TODO Auto-generated method stub
	UserNAME.sendKeys(userNameVal1);

	passWord.sendKeys(pwdVal);

	LoginClick.click();
}


public void ValidateErrorMsg(String ExpMsg) 
{
	// TODO Auto-generated method stub
	
	Assert.assertEquals(ExpMsg, Errormsz.getText());
}
      /*Login Failure Code
		WebElement UserNAME = driver.findElement(By.name("user-name"));
		UserNAME.sendKeys("abc@gmail.com");

		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("Abc1234@");

		WebElement LoginClick = driver.findElement(By.id("login-button"));
		LoginClick.click();

		WebElement Errormsz = driver.findElement(By.xpath("//h3[@data-test='error']"));
	    System.out.println(Errormsz.getText());
	    
	    //Login success 
	    
	    WebElement UserNAME1 = driver.findElement(By.name("user-name"));
		UserNAME1.sendKeys("standard_user");
		
		WebElement passWord1 = driver.findElement(By.id("password"));
		passWord1.sendKeys("secret_sauce");
		
		WebElement LoginClick1 = driver.findElement(By.id("login-button"));
		LoginClick1.click();
		
		//Locked User Test
		
		 WebElement LockedUserNAME = driver.findElement(By.name("user-name"));
		 LockedUserNAME.sendKeys("locked_out_user");
			
			WebElement LockedUsepassWord = driver.findElement(By.id("password"));
			LockedUsepassWord.sendKeys("secret_sauce");
			
			WebElement LoginClick2 = driver.findElement(By.id("login-button"));
			LoginClick2.click();
			
			WebElement Errormsz1 = driver.findElement(By.xpath("//h3[@data-test='error']"));
		    System.out.println(Errormsz1.getText());*/


	    
//add to cart
//	driver.close();




	}

