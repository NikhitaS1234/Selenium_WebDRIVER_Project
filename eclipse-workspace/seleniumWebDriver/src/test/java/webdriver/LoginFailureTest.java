package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFailureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		WebElement UserNAME = driver.findElement(By.name("user_login"));
		UserNAME.sendKeys("abc@gmail.com");
		
		WebElement  passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("Abc1234@");
		
		WebElement checkBox = driver.findElement(By.id("remember-me"));
		checkBox.click();
		
		WebElement LoginClick = driver.findElement(By.name("btn_login"));
		LoginClick.click();
		
		WebElement Errormsz = driver.findElement(By.className("error_msg"));
	    System.out.println(Errormsz.getText());
	    
	    driver.close();
	}

}
