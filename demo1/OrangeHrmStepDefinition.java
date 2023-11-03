//package demo1;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class OrangeHrmStepDefinition {
//	WebDriver driver;
//	@Before
//	public void setUP(){
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//	}
//	@Given("User is on HRMLogin page {string}")
//	public void user_is_on_hrm_login_page(String url) {
//	    driver.get(url);
//	}
//
//	@When("User enters username as {string}")
//	public void user_enters_username_as(String string) {
//		driver.findElement(By.name("username")).sendKeys(string);
//	}
//
//	@When("User enters password as {string}")
//	public void user_enters_password_as(String string) {
//		driver.findElement(By.name("password")).sendKeys(string);
//	}
//
//	@When("User clicks the login button")
//	public void user_clicks_the_login_button() {
//		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//	  
//	}
//
//	@Then("USer should be able to login successfully")
//	public void u_ser_should_be_able_to_login_successfully() {
//		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText().contains("Dashboard"));
//	   
//	}
//	@Given("User is on HRMLogin page {string}")
//	public void user_is_on_hrm_login_page(String url) {
//		driver.get(url);
//	}
//
//	@When("User enters username as {string}")
//	public void user_enters_username_as(String string) {
//		driver.findElement(By.name("username")).sendKeys(string);
//	}
//
//	@When("User enters password as {string}")
//	public void user_enters_password_as(String string) {
//		driver.findElement(By.name("password")).sendKeys(string);
//	}
//
//	@When("User clicks the login button")
//	public void user_clicks_the_login_button() {
//		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//	}
//
//	@Then("USer should be able to login successfully")
//	public void u_ser_should_be_able_to_login_successfully() {
//		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText().contains("Dashboard"));
//	}
//
//	@Then("USer should be able to get the error message")
//	public void u_ser_should_be_able_to_get_the_error_message() {
//		Assert.assertTrue(driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText().contains("Invalid credentials"));
//	}
//
//	@Then("USer should be able to get the required message")
//	public void u_ser_should_be_able_to_get_the_required_message() {
//	   Assert.assertTrue(driver.findElement(By.xpath("(//span[text()='Required'])[1]")).getText().contains("Required"));
//	   Assert.assertTrue(driver.findElement(By.xpath("(//span[text()='Required'])[2]")).getText().contains("Required"));
//	}
//	@After
//	public void close() {
//		driver.quit();
//	}
//
//
//
//
//}
