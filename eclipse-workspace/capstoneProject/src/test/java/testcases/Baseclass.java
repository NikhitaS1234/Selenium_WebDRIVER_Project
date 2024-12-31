package testcases;



	import java.time.Duration;

import org.checkerframework.dataflow.qual.AssertMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

	public class Baseclass {
		
		public static WebDriver driver;

		@BeforeMethod
		public void SetUpDriver() {

			driver = new ChromeDriver();
			driver.get("http://localhost:8081/medicare/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}

		@AssertMethod
		public void TearDown() {

			driver.close();
		}

	
}
