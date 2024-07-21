package webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardKeysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys("type something");
		query.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		query.sendKeys("type something else");
		
		query.sendKeys(Keys.ENTER);
		
	}

}
