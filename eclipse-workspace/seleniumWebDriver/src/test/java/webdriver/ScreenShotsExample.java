package webdriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		TakesScreenshot obj = (TakesScreenshot) driver;
		File source = obj.getScreenshotAs(OutputType.FILE);
		File target = new File("screenshot1.png");
		FileUtils.copyFile(source, target);

	}

}
