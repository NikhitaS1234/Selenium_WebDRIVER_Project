package webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Total no of rows"+Rows.size());
		
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total no of columns"+Columns.size());
		
        String CompamnyName = "Island Trading";
		
		// Findout contact and country name
		
		WebElement Contact = driver.findElement(By.xpath("//td[text()='" + CompamnyName + "']/following-sibling::td[1]"));
		WebElement Country = driver.findElement(By.xpath("//td[text()='" + CompamnyName + "']/following-sibling::td[2]"));
		
		System.out.println("Contact name is " + Contact.getText());
		System.out.println("Country name is " + Country.getText());
	}

}
