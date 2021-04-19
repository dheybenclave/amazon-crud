package serenity_cucumber.amazon_crud.stepdefinitions;

import org.junit.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import cucumber.runtime.SerenityBackend;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.Serenity.SerenityConfigurer;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;
import pages.LoginPage;
import rest.api.GetData;

public class login {

	@Managed
	WebDriver driver;

	@BeforeClass
	public static void setupClass() {
//		WebDriverManager.chromedriver().clearDriverCache();
//		WebDriverManager.chromedriver().setup();
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "false");

	}

	@Before
	public void setupTest() {
	}

	@After
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}

	String getUser;
	@Steps
	HomePage home;

	@Steps
	LoginPage login;
	
	@Steps
	GetData rest;

	@Given("user in the home page")
	public void user_in_the_home_page() {
		
		login.openApp();
		rest.testResponseCode1();
	}

	@When("user enter {string} as username and enter {string} as password")
	public void user_enter_as_username_and_enter_as_password(String user, String pass) {
		getUser = user.split("@")[0];
		login.doLogin(user, pass);
	}

	@Then("user should able to login")
	public void user_should_able_to_login() {
		login.verifySuccessLogin(getUser);

	}

}
