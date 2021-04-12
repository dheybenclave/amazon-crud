package pages;

import java.util.HashMap;

import net.thucydides.core.annotations.Step;
import pages.commands.homePage;

public class HomePage {

	homePage home;

	@Step("open applicaiton")
	public void openAppopenApp() {
		home.open();
		
	}

	@Step("Login Credentails")
	public void doLogin(String username, String password) {

		home.setUsernamePassword(username, password);
	}
	
	@Step("Verify Success Login")
	public void verifyTitle(){

//		home.verifyLogin();
	}

//	@Step("Navigate PAge")
//	public void navigateTo(String url) {
//		home.navigateToPageNamed(ürl);
//	}

}
