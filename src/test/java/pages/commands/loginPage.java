package pages.commands;

import org.openqa.selenium.By;

import customCommands.customCommands;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import pages.selectors.homePageSelector;

public class loginPage extends PageObject {
	customCommands api = new customCommands();

	public String title;
	public String currUrl;

	public Object verifyLogin(String getUser) {

		api.verifyApplication("?ref_=nav_ya_signin&");
		$("//*[@id=\"nav-link-accountList-nav-line-1\"]").shouldContainText(getUser);
		waitABit(4000);

		return this;
	}

	public Object setUsernamePassword(String username, String password) {

		System.out.println("3 -async");
		System.out.println("Setup The Credentials");

		api.setText("login_email_inpt", username);
		clickOn(api.map("login_signIn_btn"));

		api.setText("login_password_inpt", password);
		clickOn(api.map("login_signIn_btn"));

		return this;
	};

}
