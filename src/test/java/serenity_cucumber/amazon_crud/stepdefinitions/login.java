package serenity_cucumber.amazon_crud.stepdefinitions;

import java.util.HashMap;
import java.util.TreeMap;

import org.junit.*;

import org.openqa.selenium.WebDriver;

import customCommands.customCommands;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WhenPageOpens;
import pages.HomePage;
import pages.LoginPage;
import pages.selectors.commonPageSelector;
import pages.selectors.homePageSelector;
import pages.selectors.loginPageSelector;

public class login {

	@Managed
	WebDriver driver;

	@BeforeClass
	public static void setupClass() {
//		WebDriverManager.chromedriver().clearDriverCache();
//		WebDriverManager.chromedriver().setup();
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

	@Given("user in the home page")
	public void user_in_the_home_page() {
		login.openApp();
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
