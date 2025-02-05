package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class OrangeHRMsteps {

	private WebDriver driver;
	private LoginPage lp;

	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		System.getProperty("webdriver.chrome.driver",
				"D:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		driver.manage().window().maximize();
	}

	@When("User open URL {string}")
	public void user_open_url(String string) {
		driver.get(string);
	}

	@Then("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) throws InterruptedException {
		Thread.sleep(2000);
		lp.setEmail(string);
		lp.setPassword(string2);
	}

	@Then("Click on login")
	public void user_click_on_login() throws InterruptedException {
		Thread.sleep(2000);
		lp.clickLogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String string) throws InterruptedException {
		Thread.sleep(2000);
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(string, driver.getTitle());
		}
	}

	@Then("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		Thread.sleep(2000);
		lp.clickLogout();

	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

}



