package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage_commands extends PageObject {

	public String title;
	public String currUrl;
	
	public void getAllElement() {
		
	
		
	}

	public void setText(String selector, String value) {

		WebElementFacade element;

		WebElement searchTextBox;
		searchTextBox = $(By.id("txtUsername"));
		System.out.println(searchTextBox);

	}

	public void verifyTitle() {
		System.out.println("Verify Title ");

		title = getDriver().getTitle();
		Assert.assertTrue(title.contains("OrangeHRM"));

	};

	public void setUsernamePassword(String username, String password) {

		System.out.println("Setup The Credentials");

		$(By.id("txtUsername")).typeAndTab(username);
		$(By.id("txtPassword")).typeAndEnter(password);

	};

	public void verifyLogin() {

		System.out.println("Verify Dashboard - Login : true ");

		currUrl = getDriver().getCurrentUrl();
		Assert.assertTrue(currUrl.contains("dashboard"));
		$(By.xpath("//*[@id=\"content\"]//*[text()=\"Dashboard\"]")).shouldBeVisible();

	};

}
