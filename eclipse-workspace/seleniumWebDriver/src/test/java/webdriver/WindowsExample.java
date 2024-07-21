package webdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement tabBtn = driver.findElement(By.id("tabButton"));
((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", tabBtn );
		tabBtn.click();
		
		
		List<String> allWin = new ArrayList<>(driver.getWindowHandles());
		
		System.out.println("Parent win handle is " + allWin.get(0));
		System.out.println("Child win handle is " + allWin.get(1));
		
		driver.switchTo().window(allWin.get(1));
		
		WebElement childHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header of the child tab is " + childHeader.getText());
		
		
		driver.close();  // will close only the current window
		// driver.quit(); // will close all the windows
	}

}
