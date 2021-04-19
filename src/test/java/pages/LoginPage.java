package pages;

import org.apache.xpath.XPath;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.ClickAction;

import api.*;
import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import pages.commands.loginPage;
import pages.selectors.homePageSelector;
import rest.api.*;

public class LoginPage extends PageObject {

	loginPage login;
	customCommands api = new customCommands();
	homePageSelector _s = new homePageSelector();

	@Step("Open Applicaiton")
	public void openApp() {

		login.open();

	}

	@Step("Login Credentails")
	public void doLogin(String username, String password) {

		api.map("common_account_dropdwn").waitUntilVisible();
		
		api.verifyApplication("amazon");
		clickOn(api.map("common_account_dropdwn"));
		api.verifyApplication("https://www.amazon.com/ap/signin?");
		login.setUsernamePassword(username, password);

	}

	@Step("Verify Success Login")
	public void verifySuccessLogin(String getUser) {
		System.out.println("verifySuccessLogin: 'Expected Success' for '" + getUser + "' ");
		login.verifyLogin(getUser);
	}

//	@Step("Navigate PAge")
//	public void navigateTo(String url) {
//		home.navigateToPageNamed(ürl);
//	}

}
