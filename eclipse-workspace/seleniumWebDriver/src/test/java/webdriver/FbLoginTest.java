package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys("abcd@gmail.com");
		
		WebElement Pwd = driver.findElement(By.name("pass"));
		Pwd.sendKeys("Nik1@nik2");
		
		WebElement LoginClick = driver.findElement(By.name("login"));
		LoginClick.click();
		
	}

}
