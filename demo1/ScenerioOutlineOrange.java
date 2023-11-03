package demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenerioOutlineOrange {
	WebDriver driver;
	@Before
	public void setUP(){
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	@Given("User is on Home page {string}")
	public void user_is_on_home_page(String url) {
		driver.get(url);
	}

	@When("User to enter username {string}")
	public void user_to_enter_username(String username) {
		driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("User to enter password {string}")
	public void user_to_enter_password(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("User clicks the login")
	public void user_clicks_the_login() {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

	}

	@Then("Login is unsuccessfull with error messages")
	public void login_is_unsuccessfull_with_error_messages() {
		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText().contains("Invalid credentials"));
	}
}
