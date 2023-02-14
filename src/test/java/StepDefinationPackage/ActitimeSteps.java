package StepDefinationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeSteps {
	 WebDriver driver=null;
	
	@Given("Open the browser")
	public void open_the_browser() {
	   System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Bivas\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("user have to enter the url of application")
	public void user_have_to_enter_the_url_of_application() {
	 driver.get("https://demo.actitime.com/login.do");  
	}

	@When("user enter valid username and pwd")
	public void user_enter_valid_username_and_pwd() {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin",Keys.TAB,"manager");
	}

	
		
	

	@When("click on login btn")
	public void click_on_login_btn() {
	  driver.findElement(By.xpath("//div[text()='Login ']")).click();  
	}

	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() {
	 driver.getPageSource().contains("Enter Time-Track	 for");  
	}


}
