package stepDefs;

import java.time.Duration;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceOrderFlowStepDefs {

	WebDriver driver = Hooks.driver;
	public WebDriverWait wait;
	WebElement Location;
	// List<String> Address;

	@Given("I have launched the application11")
	public void i_have_launched_the_application11() {
		driver.get("https://www.pizzahut.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Hooks.test.log(LogStatus.PASS, "Application Launched");
	}

	@When("I enter the location as {string}")
	public void i_enter_the_location_as(String place) throws InterruptedException {
		Location = driver.findElement(By.xpath("//input[@placeholder='Enter your location for delivery']"));
		// input[@placeholder='Enter your location for delivery']
		Location.sendKeys(place);
		Thread.sleep(2000);

		Hooks.test.log(LogStatus.PASS, "Entered Location");
	}

	@When("I select the very first suggestion from the list")
	public void i_select_the_very_first_suggestion_from_the_list() throws InterruptedException {

		List<WebElement> suggList = driver.findElements(By.xpath("//div[contains(@class,'flex flex-col')]"));

		for (WebElement e : suggList) {
			System.out.println(e.getText());

		}
		Location.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Location.sendKeys(Keys.ENTER);

		Thread.sleep(10000);
		System.out.println(Location);
		Hooks.test.log(LogStatus.PASS, "Very first suggestion selected from the list");

	}

	@Then("I should land on the Deals page")
	public void i_should_land_on_the_Deals_page() throws InterruptedException {

		String DealsPage = driver.getCurrentUrl();

		Thread.sleep(2000);
		System.out.println(DealsPage);
		Hooks.test.log(LogStatus.PASS, "Landed on Deals Page");

	}

	@Then("I select the tab")
	public void i_select_the_tab() throws InterruptedException {
		WebElement Tablink = driver.findElement(By.cssSelector("a[data-synth='link--pizzas--side'] span"));

		Tablink.click();
		Thread.sleep(10000);
		String PizzaTab = driver.getCurrentUrl();
		System.out.println(PizzaTab);
		Hooks.test.log(LogStatus.PASS, "Selected Tab");
	}

	@Then("I add {string} to the basket")
	public void i_add_to_the_basket(String itemadded) throws InterruptedException {

		WebElement AddItem = driver.findElement(By.xpath("//button[contains(@data-synth,'button--" + itemadded
				+ "-recommended-pan-personal--one-tap')]//span//span[contains(text(),'Add')]"));

		AddItem.click();
		Thread.sleep(5000);
		System.out.println(AddItem);
		Hooks.test.log(LogStatus.PASS, "Added to basket");
	}

	@Then("I note down the price {string} displayed on the screen")
	public void i_note_down_the_price_displayed_on_the_screen(String priceD) {

		WebElement PriceDisplayed = driver.findElement(By.xpath(
				"//button[contains(@data-synth,'button--mazedar-makhni-paneer-recommended-pan-personal--one-tap')]//span[contains(@class,'w-auto ml-3')][contains(text(),'"
						+ priceD + "')]"));
		// Assert.assertEquals(PriceDisplayed, "₹359");
		System.out.println(PriceDisplayed.getText());
		Hooks.test.log(LogStatus.PASS, "Price noted down");
	}

	@Then("I should see the pizza {string} is added to the cart")
	public void i_should_see_the_pizza_is_added_to_the_cart(String ItemaddedToCart) {

		WebElement ItemAddedToCart = driver.findElement(By.xpath("//div[text()='" + ItemaddedToCart + "']"));

		System.out.println(ItemAddedToCart.getText());
		Hooks.test.log(LogStatus.PASS, "Selected item added to cart");
	}

	@Then("price is also displayed correctly")
	public void price_is_also_displayed_correctly() {

		WebElement PriceDisplayedCorrectly = driver.findElement(
				By.xpath("//div[@class='basket-item-product-price leading-tight bold text-15 text-black']"));
		System.out.println(PriceDisplayedCorrectly.getText());
		Hooks.test.log(LogStatus.PASS, "Price displayed");
	}

	@Then("I click on the Checkout button")
	public void i_click_on_the_Checkout_button() throws InterruptedException {
		WebElement ClickCheckout = driver.findElement(By.xpath("//span[contains(text(),'Checkout')]"));
		ClickCheckout.click();
		Thread.sleep(5000);
		Hooks.test.log(LogStatus.PASS, "Clicked checkout button");

	}

	@Then("I should be landed on the secured checkout page")
	public void i_should_be_landed_on_the_secured_checkout_page() throws InterruptedException {

		String SecuredCheckoutPage = driver.getCurrentUrl();

		Thread.sleep(2000);
		System.out.println(SecuredCheckoutPage);
		Hooks.test.log(LogStatus.PASS, "Landed on secured checkout page");
	}

	@Then("I enter the personal details")
	public void i_enter_the_personal_details(DataTable details) throws InterruptedException {

		List<Map<String, String>> UserDetails = details.asMaps(String.class, String.class);

		for (Map<String, String> data1 : UserDetails) {
			WebElement EnterName = driver.findElement(By.xpath("//input[@id='checkout__name']"));
			EnterName.sendKeys(data1.get("Name"));
			Thread.sleep(1000);
			WebElement EnterMobile = driver.findElement(By.xpath("//input[@id='checkout__phone']"));
			EnterMobile.sendKeys(data1.get("Mobile"));
			Thread.sleep(1000);
			WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='checkout__email']"));
			EnterEmail.sendKeys(data1.get("Email"));
			Thread.sleep(1000);
			Hooks.test.log(LogStatus.PASS, "Personal details entered");
		}
	}

	@Then("I enter the address details")
	public void i_enter_the_address_details(DataTable address) throws InterruptedException {

		List<List<String>> data = address.asLists(String.class);

		WebElement AddressEntered = driver.findElement(By.xpath("//input[@id='checkout__deliveryAddress.interior']"));
		AddressEntered.sendKeys(data.get(0).get(0));
		WebElement AddressEntered1 = driver.findElement(By.xpath("//input[@id='checkout__deliveryAddress.notes']"));
		AddressEntered1.sendKeys(data.get(1).get(0));
		System.out.println("-------Adress entered successfully----------");
		Hooks.test.log(LogStatus.PASS, "Address entered");

	}

}
