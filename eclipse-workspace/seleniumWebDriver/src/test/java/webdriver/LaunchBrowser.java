package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Dell/eclipse/java-2022-12/chromedriver-win32/chromedriver.exe");

		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		
		
	}

}
