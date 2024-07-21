package webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpTest {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				WebElement SignUp = driver.findElement(By.partialLinkText("Create new"));
				SignUp.click();
				
				WebElement FirstName = driver.findElement(By.name("firstname"));
				FirstName.sendKeys("Nikhita");
				
				WebElement LastName = driver.findElement(By.name("lastname"));
				LastName.sendKeys("Sarole");
				
				WebElement Email = driver.findElement(By.name("reg_email__"));
				Email.sendKeys("nik1@gmail.com");
				
				
				WebElement Passwd = driver.findElement(By.id("password_step_input"));
				Passwd.sendKeys("Nik1@1234dee");
				
				WebElement day = driver.findElement(By.id("day"));
				Select ddDay = new Select(day);
				ddDay.selectByVisibleText("1");
				
				WebElement month = driver.findElement(By.id("month"));
				Select ddMonth = new Select(month);
				ddMonth.selectByVisibleText("Jan");
				
				WebElement year = driver.findElement(By.id("year"));
				Select ddYear = new Select(year);
				ddYear.selectByVisibleText("2014");
				
				
			    //Gender
				
				WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
				gender.click();
				
                List<WebElement> months =driver.findElements(By.xpath("//select[@id='month']/option"));
                
                for(WebElement m : months)
                {
                	System.out.println(m.getText());
                }
                
                List<WebElement> links = driver.findElements(By.tagName("a"));
                System.out.println("Total number of linke=s on the webpage" + links.size());
                
                List<WebElement> buttons = driver.findElements(By.tagName("button"));
                System.out.println("Total number of linke=s on the webpage" + buttons.size());
				
			}
		

	}

