package StepDefinationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;   okkkkk.....llll

import io.cucumber.java.en.*;

public class BcucumbrClass {
	WebDriver driver=null;
	@Given("Browser is open")
	public void browser_is_open() {
	   
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Bivas\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver= new ChromeDriver();
	
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
	   driver.get("https://www.google.com");
	}

	@When("user enter text in a search box")
	public void user_enter_text_in_a_search_box() {
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("concentric pune");
	}

	@When("user hit enter")
	public void user_hit_enter() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigate to the search result page")
	public void user_is_navigate_to_the_search_result_page() {
	   driver.getPageSource().contains("102 followers on LinkedIn");
	}


}
