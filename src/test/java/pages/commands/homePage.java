package pages.commands;

import org.openqa.selenium.By;

import api.*;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import pages.selectors.*;
public class homePage extends PageObject {

	customCommands api = new customCommands();
	homePageSelector _s = new homePageSelector();

	public String title;
	public String currUrl;

	public void setUsernamePassword(String username, String password) {

		System.out.println("Setup The Credentials");

		api.SeText("email_inpt", username);
		api.SeText("password_inpt", password);

		clickOn($(_s.get("login_btn")));

	};

	public void verifyTitle() {
		System.out.println("Verify Title ");

		title = getDriver().getTitle();
		Assert.assertTrue(title.contains("facebook"));

	};

	public void verifyLogin() {

		System.out.println("Verify Dashboard - Login : true ");

		currUrl = getDriver().getCurrentUrl();
		Assert.assertTrue(currUrl.contains("https://www.amazon.com/ap/signin?"));
		$(By.xpath("//*[@id=\"content\"]//*[text()=\"Dashboard\"]")).shouldBeVisible();

	};

}
