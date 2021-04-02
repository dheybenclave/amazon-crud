package serenity_cucumber.amazon_crud.stepdefinitions;

import org.junit.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class login {

	@Managed
	WebDriver driver;
//
//	@BeforeClass
//	public static void setupClass() {
//		WebDriverManager.chromedriver().clearDriverCache();
//		WebDriverManager.chromedriver().setup();
//	}

//	@Before
//	public void setupTest() {
//		driver = new ChromeDriver();
//
//	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@Steps
	HomePage home;

	@Given("user in the home page")
	public void user_in_the_home_page() {
		home.openApp();
	}

	@When("user enter {string} as username and enter {string} as password")
	public void user_enter_as_username_and_enter_as_password(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("sampe");
	}

	@Test
	@Then("user should able to login")
	public void user_should_able_to_login() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("sampe123");
	}

}
