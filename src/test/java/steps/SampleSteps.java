package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleSteps {
WebDriver driver;
WebElement element;
	
	@Given("user navigate to homepage")
	public void user_navigate_to_homepage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.travelers.com/");
	   System.out.println("This is given");
	}

	@Then("user click on product element")
	public void user_click_on_product_element() {
		element= driver.findElement(By.id("trans-fake-get-quote"));
		element.click();
		 System.out.println("This is Then");
	}

	@Then("user select boat")
	public void user_select_boat() {
		element = driver.findElement(By.id("lbl-0-7"));
		element.click();
		 System.out.println("This is Then");
	}

	@Then("user input zipcode")
	public void user_input_zipcode() {
		element = driver.findElement(By.name("zipCode"));
		element.sendKeys("11230");
		 System.out.println("This is Then");
	}

	@When("click start quote")
	public void click_start_quote() {
		element= driver.findElement(By.id("body-btn-get-quote"));
		element.click();
		 System.out.println("This is When");
	}

	@Then("user will be in about you page")
	public void user_will_be_in_about_you_page() throws InterruptedException{
		Thread.sleep(300);
		 System.out.println("This is Then");
	}

	@Then("title of the page will be <Information About You>")
	public void title_of_the_page_will_be_information_about_you() {
		driver.quit();
		 System.out.println("Title of About You");
	}
	
}
